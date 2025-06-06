package com.impl;

import com.inter.IObserver;

public class SecondObserver implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("Second Observer: value has been modified by " + i);
    }
}
