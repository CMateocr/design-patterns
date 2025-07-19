package com.impl;

import com.annotations.InstanceMethod;
import com.inter.Vehicle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Adaptable<T> implements Vehicle {

  private T instance;
  private Method method;

  public Adaptable(T instance) {
    this.instance = instance;

    if(instance.getClass().isInstance( Vehicle.class )) {
      try {
        this.method = instance.getClass().getMethod( "drive" );
        return;
      } catch (NoSuchMethodException e) {
        throw new RuntimeException(e);
      }
    }

    if(!instance.getClass().isAnnotationPresent(InstanceMethod.class)) {
      throw new Error("Class has no annotation");
    }

    String methodName = instance.getClass().getAnnotation(InstanceMethod.class).name();

    try {
      this.method = instance.getClass().getMethod( methodName );
    } catch (NoSuchMethodException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void drive() {
    try {
      method.invoke( instance );
    } catch (IllegalAccessException e) {
      throw new RuntimeException(e);
    } catch (InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}
