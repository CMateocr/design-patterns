package com.impl;

import com.inter.IObserver;
import com.inter.ISubject;

import java.util.ArrayList;
import java.util.List;

public class FirstSubject implements ISubject {
    private int value;
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void register(IObserver observer) {
        observers.add( observer );
    }

    @Override
    public void unregister(IObserver observer) {
        observers.remove( observer );
    }

    @Override
    public void notifyObservers(int value) {
        observers.forEach((item) -> item.update( value ));
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers( value );
    }

    public List<IObserver> getObservers() {
        return observers;
    }
}
