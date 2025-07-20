package com.factory;

import com.annotations.Component;
import com.google.common.reflect.ClassPath;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Factory implements IFactory{
  Map<String, Class<?>> components = new HashMap<>();
  @Override
  public void init(String packageName) {
    ClassLoader classLoader = Factory.class.getClassLoader();
    try {
      ClassPath classPath = ClassPath.from( classLoader );
      var classes = classPath.getTopLevelClassesRecursive( packageName );

      this.components = classes.stream()
              .map(ClassPath.ClassInfo::load)
              .filter(clazz -> clazz.isAnnotationPresent(Component.class))
              .collect(Collectors.toMap(
                      (clazz) -> clazz.getAnnotation(Component.class).value(),
                      (clazz) -> clazz
              ));

      System.out.println(components);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public <T> T create(Class<?> clazz) {
    if(!clazz.isAnnotationPresent(Component.class)) return null;

    String name = clazz.getAnnotation(Component.class).value();

    if(!components.containsKey(name)) return null;

    try {
      var ct = components.get(name).getConstructor();
      return (T) ct.newInstance();
    } catch (NoSuchMethodException e) {
      return null;
    } catch (InvocationTargetException e) {
      return null;
    } catch (InstantiationException e) {
      return null;
    } catch (IllegalAccessException e) {
      return null;
    }
  }
}
