package com.impl;

import com.inter.IObserver;

public class FirstObserver implements IObserver {
    @Override
    public void update(int i) {
        System.out.println("First Observer: value has been modified by " + i);
    }
}
