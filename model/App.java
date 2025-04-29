package org.com.model;

import org.com.inter.IButton;
import org.com.inter.IUIFactory;
import org.com.inter.IWindow;

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
