package org.com.impl.dark;

import org.com.inter.IButton;

public class DarkButton implements IButton {
  @Override
  public void draw() {
    System.out.println("Drawing a dark button");
  }
}
