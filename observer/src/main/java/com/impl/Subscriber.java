package com.impl;

import com.inter.IObservable;
import com.inter.IObserver;

public class Subscriber implements IObserver {
  private IObservable observable;

  public Subscriber(IObservable observable) {
    this.observable = observable;
  }

  @Override
  public void update() {
    System.out.println("New video posted");
  }
}
