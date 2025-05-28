package com.impl;

import com.inter.IAnalize;

public abstract class FastAnalysis implements IAnalize {

  @Override
  public void analize() {
    init();
    skipCompressed();
    stop();
  }

  public abstract void init();

  public abstract void skipCompressed();

  public abstract void stop();
}
