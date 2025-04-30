package com.impl.dark;

import com.inter.IButton;

public class DarkButton implements IButton {
  @Override
  public void draw() {
    System.out.println("Drawing a dark button");
  }
}
