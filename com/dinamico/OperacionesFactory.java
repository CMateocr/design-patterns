package com.dinamico;

import com.impl.OperacionesCadenasImpl;
import com.impl.OperacionesNumerosImpl;
import com.inter.IOperacionesCadenas;
import com.inter.OperacionesNumeros;

import java.lang.reflect.Constructor;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public final class OperacionesFactory {

    private static Map<Class<?>, Class<?>> servicio = new HashMap<>();

    public static void registrar(Class<?> in, Class<?> impl) {
        servicio.put(in, impl);
    }

    public static <T> T crear(Class<T> in) {
        Class<?> impl = servicio.get(in);

        Constructor<?> ctor = impl.getDeclaredConstructors()[0];

        Object target = null;

        try {
            target = ctor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Object proxy = crearProxy(target);

        return in.cast(proxy);
    }

    private static Object crearProxy(Object target) {

        Object proxy = Proxy.newProxyInstance(OperacionesFactory.class.getClassLoader(), target.getClass().getInterfaces(), new ImpresionInvocationHandle(target));

        return proxy;
    }

//    public static <T> T crearNumero(Class<T> clazz) {
//
//        OperacionesNumeros target = new OperacionesNumerosImpl();
//
//        Object proxy = crearProxy(target);
//
//        return clazz.cast(proxy);
//    }
//
//    public static <T> T crearCadenas(Class<T> clazz) {
//        IOperacionesCadenas target = new OperacionesCadenasImpl();
//
//        Object proxy = crearProxy(target);
//
//        return clazz.cast(proxy);
//    }

}
