package org.com.impl.light;

import org.com.anotation.Theme;
import org.com.inter.IButton;
import org.com.inter.IUIFactory;
import org.com.inter.IWindow;

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
