package com.impl;

import com.inter.IOperacionNumeros;

public class OperacionNumeroImpl implements IOperacionNumeros {

  @Override
  public int sum(int x, int y) {
    return x + y;
  }

  @Override
  public int decrease(int x, int y) {
    return x - y;
  }
}
