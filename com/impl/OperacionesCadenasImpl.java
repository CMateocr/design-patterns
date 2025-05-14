package com.impl;

import com.inter.IOperacionesCadenas;

public class OperacionesCadenasImpl implements IOperacionesCadenas {
    @Override
    public String may(String s) {
        return s.toUpperCase();
    }
}
