package org.com.impl.light;

import org.com.inter.IWindow;

public class LightWindow implements IWindow {
  @Override
  public void open() {
    System.out.println("Opening a light window");
  }
}
