package com.dinamico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ImpresionInvocationHandle implements InvocationHandler {
    Object target;

    public ImpresionInvocationHandle(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object... args) throws Throwable {
        System.out.println("Invocando a metodo: ");

        System.out.println( method.getName() );

        System.out.println(Arrays.toString(args));

        long inicio = System.nanoTime();

        Object res = method.invoke(target, args);

        long fin = System.nanoTime() - inicio;

        System.out.printf("Tiempo %.3f ms\n", fin/100.0f);

        return res;
    }
}
