package com.impl;

import com.inter.OperacionesNumeros;

public class OperacionesNumerosImpl implements OperacionesNumeros {
    @Override
    public int sumar(int x, int y) {
        return x + y;
    }

    @Override
    public int restar(int x, int y) {
        return x - y;
    }
}
