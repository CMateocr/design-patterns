package com.gen;

import com.anotation.Theme;
import com.google.common.reflect.ClassPath;
import com.inter.IUIFactory;

import java.util.HashMap;
import java.util.Map;

public class AbstractFactoryLoader {

  private Map<String, Class<? extends IUIFactory>> factories = new HashMap<>();

  public void init(String packageName) {
      try {
          ClassPath classPath = ClassPath.from(getClass().getClassLoader());

          for (ClassPath.ClassInfo classInfo : classPath.getTopLevelClassesRecursive(packageName)) {
              Class<?> clazz = classInfo.load();

              if (clazz.isAnnotationPresent(Theme.class)) {
            	  Theme tema = clazz.getAnnotation(Theme.class);
            	  
                  String temaValue = tema.value();

                  if (!factories.containsKey(temaValue)) {
                      factories.put(temaValue, (Class<? extends IUIFactory>) clazz);
                  }
              }
          }
      } catch (Exception e) {
          System.err.println("Error at initializing factory: " + e.getMessage());
          
          e.printStackTrace();
      }
  }
  
  public IUIFactory createFactory(String theme) {
	  Class<? extends IUIFactory> factoryClass = factories.get(theme);
	  
	  if(factoryClass == null) throw new RuntimeException("theme not founf with " + theme);
	  
	  try {
		  return factoryClass.getDeclaredConstructor().newInstance();
	  } catch (Exception e) {
		  throw new RuntimeException("Error at trying to instance the factory");
	  }
  }

}
