package com.impl.light;

import com.anotation.Theme;
import com.inter.IButton;
import com.inter.IUIFactory;
import com.inter.IWindow;

@Theme(value = "light")
public class LightUIFactory implements IUIFactory {
  @Override
  public IButton createButton() {
    return new LightButton();
  }

  @Override
  public IWindow createWindow() {
    return new LightWindow();
  }
}
