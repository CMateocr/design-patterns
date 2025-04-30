package com.model;

import com.inter.IButton;
import com.inter.IUIFactory;
import com.inter.IWindow;

public class App {

  private IButton button;
  private IWindow window;

  public App(IUIFactory factory) {
    this.button = factory.createButton();
    this.window = factory.createWindow();
  }

  public void execute() {
    button.draw();
    window.open();
  }

}
