package org.com.impl.light;

import org.com.inter.IButton;

public class LightButton implements IButton {
  @Override
  public void draw() {
    System.out.println("Drawing a light button");
  }
}
