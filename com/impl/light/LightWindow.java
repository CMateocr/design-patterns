package com.impl.light;

import com.inter.IWindow;

public class LightWindow implements IWindow {
  @Override
  public void open() {
    System.out.println("Opening a light window");
  }
}
