package org.com.impl.dark;

import org.com.anotation.Theme;
import org.com.inter.IButton;
import org.com.inter.IUIFactory;
import org.com.inter.IWindow;

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
