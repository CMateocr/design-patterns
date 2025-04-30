package com.impl.light;

import com.inter.IButton;

public class LightButton implements IButton {
  @Override
  public void draw() {
    System.out.println("Drawing a light button");
  }
}
