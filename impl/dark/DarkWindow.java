package org.com.impl.dark;

import org.com.inter.IWindow;

public class DarkWindow implements IWindow {
  @Override
  public void open() {
    System.out.println("Opening a darkl window");
  }
}
