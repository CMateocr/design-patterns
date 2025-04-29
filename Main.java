package org.com;

import org.com.config.ConfigLoader;
import org.com.impl.dark.DarkUIFactory;
import org.com.impl.light.LightUIFactory;
import org.com.inter.IUIFactory;
import org.com.model.App;

public class Main {
  public static void main(String[] args) {

    ConfigLoader configService = new ConfigLoader("config.properties");

    IUIFactory factory;
    String theme = configService.get("THEME");

    System.out.println(theme);

    if(theme.equals("light")) {
      factory = new LightUIFactory();
    } else {
      factory = new DarkUIFactory();
    }

    App app = new App(factory);
    app.execute();
  }
}
