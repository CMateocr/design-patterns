package com.adapter;

import com.annotation.Adapter;
import com.inter.Vehicle;

import java.lang.reflect.Method;

public class Adaptable<T> implements Vehicle {
  private final T instance;
  private final Method method;

  public Adaptable(T instance) throws NoSuchMethodException {
    this.instance = instance;

    Class<?> clazz = instance.getClass();

    Adapter adapter = clazz.getAnnotation(Adapter.class);

    if (adapter == null) {
      throw new IllegalArgumentException("Class " + clazz.getName() + " is not annotated with @Adapter");
    }

    String methodName = adapter.method();

    method = clazz.getMethod(methodName);
  }

  @Override
  public void drive() {
    try {
      method.invoke(instance);
    } catch (Exception e) {
      throw new RuntimeException("Failed to invoke method " + method.getName() + " on instance of " + instance.getClass().getName(), e);
    }
  }
}
