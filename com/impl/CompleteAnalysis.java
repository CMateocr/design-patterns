package com.impl;

import com.inter.IAnalize;

public abstract class CompleteAnalysis implements IAnalize {

  @Override
  public void analize() {
    init();
    analizeMemory();
    analizeKeyLoggers();
    analizeRootKits();
    unzip();
    stop();
  }

  public abstract void init();

  public abstract void analizeMemory();

  public abstract void analizeKeyLoggers();

  public abstract void analizeRootKits();

  public abstract void unzip();

  public abstract void stop();
}
