package com.impl;

import com.inter.OperacionesNumeros;

public class OperacionesNumeroProxy implements OperacionesNumeros {

    private OperacionesNumerosImpl target = new OperacionesNumerosImpl();
    @Override
    public int sumar(int x, int y) {
        System.out.println("Aniadiendo informacion");
        int res =  target.sumar(x, y);
        System.out.println("El objeto real se ejecuto con informacion");

        return res;
    }

    @Override
    public int restar(int x, int y) {
        System.out.println("Aniadiendo informacion");
        int res =  target.restar(x, y);
        System.out.println("El objeto real se ejecuto con informacion");

        return res;
    }
}
