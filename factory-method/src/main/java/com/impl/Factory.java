package com.impl;

import com.annotation.Component;
import com.google.common.reflect.ClassPath;
import com.inter.IFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Factory implements IFactory {

  private Map<String, Class<?>> components = new HashMap<>();

  @Override
  public void init(String packageName) {
    ClassLoader classLoader = Factory.class.getClassLoader();

    try {
      ClassPath classPath = ClassPath.from( classLoader );
      var classes = classPath.getTopLevelClassesRecursive( packageName );
      this.components = classes.stream()
              .filter(clazz -> clazz.load().isAnnotationPresent(Component.class))
              .reduce(
                      new HashMap<String, Class<?>>(),
                      (acc, curr) -> {
                        Class<?> loadedClass = (Class<?>) curr.load();
                        acc.put(loadedClass.getAnnotation(Component.class).name(), loadedClass);
                        return acc;
                      },
                      (map1, map2) -> {
                        map1.putAll(map2);
                        return map1;
                      }
              );

      System.out.println("Components found: " + components);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public <T> T create(Class<?> clazz) {
    if(!clazz.isAnnotationPresent(Component.class)) return null;

    String name = clazz.getAnnotation(Component.class).name();

    if(!components.containsKey(name)) {
      throw new RuntimeException("Component " + name + " not registered");
    }

    try {
      var constructor = components.get(name).getConstructor();
      return (T) constructor.newInstance();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
