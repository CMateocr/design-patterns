package com.dinamico;

import com.impl.OperacionesCadenasImpl;
import com.impl.OperacionesNumerosImpl;
import com.inter.IOperacionesCadenas;
import com.inter.OperacionesNumeros;

import java.lang.reflect.Proxy;

public final class OperacionesFactory {
    private static Object crearProxy(Object target) {

        Object proxy = Proxy.newProxyInstance(OperacionesFactory.class.getClassLoader(), target.getClass().getInterfaces(), new ImpresionInvocationHandle(target));

        return proxy;
    }

    public static <T> T crearNumero(Class<T> clazz) {

        OperacionesNumeros target = new OperacionesNumerosImpl();

        Object proxy = crearProxy(target);

        return clazz.cast(proxy);
    }

    public static <T> T crearCadenas(Class<T> clazz) {
        IOperacionesCadenas target = new OperacionesCadenasImpl();

        Object proxy = crearProxy(target);

        return clazz.cast(proxy);
    }

}
