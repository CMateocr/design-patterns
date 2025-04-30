package com;

import com.config.ConfigLoader;
import com.impl.dark.DarkUIFactory;
import com.impl.light.LightUIFactory;
import com.inter.IUIFactory;
import com.model.App;

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
