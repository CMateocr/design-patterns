package com.dinamico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CadenaInvocationHandler implements InvocationHandler {
  Object target;

  public CadenaInvocationHandler(Object target) {
    this.target = target;
  }

  @Override
  public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
    System.out.println("Entrando al invoke de cadena");
    Object res = method.invoke(target, objects);

    return res;
  }
}
