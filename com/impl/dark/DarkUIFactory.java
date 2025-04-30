package com.impl.dark;

import com.anotation.Theme;
import com.inter.IButton;
import com.inter.IUIFactory;
import com.inter.IWindow;

@Theme(value = "dark")
public class DarkUIFactory implements IUIFactory {
  @Override
  public IButton createButton() {
    return new DarkButton();
  }

  @Override
  public IWindow createWindow() {
    return new DarkWindow();
  }
}
