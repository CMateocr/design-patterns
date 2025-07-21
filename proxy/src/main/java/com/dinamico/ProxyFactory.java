package com.dinamico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class ProxyFactory {
  private static Map<Class<?>, Class<?>> services = new HashMap<>();

  public static void register(Class<?> in, Class<?> impl) {
    services.put(in, impl);
  }

  public static <T> T create(Class<T> in, Class<? extends InvocationHandler> invocationHandler) {
    Class<?> impl = services.get(in);

    if(impl == null) return null;

    try {
      var ct = impl.getDeclaredConstructor();
      T instance = (T) ct.newInstance();
      var invocationHandlerCtr = invocationHandler.getDeclaredConstructor(Object.class);
      var invocationHandlerInstance = invocationHandlerCtr.newInstance( instance );

      Object proxy = createProxy( instance, invocationHandlerInstance );

      return in.cast( proxy );
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

  public static Object createProxy(Object target, InvocationHandler invocationHandler) {
    return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
  }
}
