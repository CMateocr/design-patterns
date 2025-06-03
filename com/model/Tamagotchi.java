package com.model;

import com.inter.HappyState;
import com.inter.IState;

public class Tamagotchi {
  private IState context;

  public Tamagotchi() {
    this.context = new HappyState();
  }

  public void setState(IState state) {
    this.context = state;
  }

  public void play() {
    this.context.play(this);
  }

  public void feed() {
    this.context.feed(this);
  }

  public void sleep() {
    this.context.sleep(this);
  }
}