package org.com.base;

import java.util.HashMap;
import java.util.Map;

import com.google.common.reflect.ClassPath;
import org.com.anotation.Component;

public class Factory {
  private Map<String, Class> componentes = new HashMap<String, Class>();

  public void init(String packageName) {
    System.out.println("inicialization"+ Factory.class.getClassLoader());
    try {
      ClassPath classPath = ClassPath.from(Factory.class.getClassLoader());
      var classes = classPath.getTopLevelClassesRecursive(packageName);
      for (var myClass : classes) {
        if(!myClass.load().isAnnotationPresent(Component.class)) continue;
        String anotation = myClass.load().getAnnotation(Component.class).value();
        componentes.put(anotation, myClass.load());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public <T> T create(Class<T> clazz) {
    if(!clazz.isAnnotationPresent(Component.class))  throw new RuntimeException(clazz.getName() +" must implement " + Component.class.getName());
    if(!componentes.containsKey(clazz.getAnnotation(Component.class).value())) throw new RuntimeException(Component.class +" not found");
    try {
      var constructor = componentes.get(clazz.getAnnotation(Component.class).value()).getConstructor();
      return (T) constructor.newInstance();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }


}