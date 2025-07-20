package com.factory;

import com.annotations.Component;
import com.google.common.reflect.ClassPath;
import com.inter.IColor;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Factory implements IFactory {
  HashMap<String, Class<?>> classes;

  @Override
  public void init() {
    ClassLoader classLoader = Factory.class.getClassLoader();

    try {
      ClassPath classPath = ClassPath.from( classLoader );
      var classes = classPath.getTopLevelClassesRecursive("com.model");

      this.classes = classes.stream()
              .filter(clazz -> clazz.load().isAnnotationPresent(Component.class))
              .collect(Collectors.toMap(
                      (clazz) -> clazz.load().getAnnotation(Component.class).value(),
                      (clazz) -> clazz.load(),
                      (existing, replacement) -> existing,
                      HashMap::new
              ));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public <T> T create(Class<?> clazz) {
    if(!clazz.isAnnotationPresent(Component.class)) return null;

    String className = clazz.getAnnotation(Component.class).value();

    if(!classes.containsKey(className)) {
      throw new RuntimeException("Component " + className + " not registered");
    }

    try {
      var ct = classes.get( className ).getConstructor();
      return (T) ct.newInstance();
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public <T> T create(Class<?> clazz, IColor color) {
    if(!clazz.isAnnotationPresent(Component.class)) return null;

    String name = clazz.getAnnotation(Component.class).value();

    try {
      var ct = classes.get( name ).getDeclaredConstructor(IColor.class);
      return (T) ct.newInstance(color);
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    } catch (InstantiationException e) {
      throw new RuntimeException(e);
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    }
  }
}
