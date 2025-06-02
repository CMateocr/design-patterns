package com.impl;

import com.anotation.Component;
import com.google.common.reflect.ClassPath;
import com.inter.IFactory;

import java.util.HashMap;
import java.util.Map;

public class Factory implements IFactory {

  Map<String, Class<?>> components = new HashMap<>();

  @Override
  public void init(String packageName) {
    ClassLoader factoryClassLoader = this.getClass().getClassLoader();
    System.out.println("Factory initialized " + factoryClassLoader);

    try {
      ClassPath classPath = ClassPath.from(factoryClassLoader);
      var classes = classPath.getTopLevelClassesRecursive( packageName );

      for(var clazz : classes) {
        if(!clazz.load().isAnnotationPresent(Component.class)) continue;

        Class<?> loadedClass = clazz.load();
        String componentName = loadedClass.getAnnotation(Component.class).name();

        components.put(componentName, loadedClass);
      }
    } catch (Exception e) {
      System.out.println("Error initializing factory: " + e.getMessage());
    }
  }

  @Override
  public <T> T create(Class<?> clazz) {
    return null;
  }
}
