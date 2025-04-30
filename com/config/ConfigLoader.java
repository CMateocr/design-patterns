package com.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
  private Properties configService;

  public ConfigLoader(String fileName) {
    this.configService = new Properties();

    try(InputStream input = getClass().getClassLoader().getResourceAsStream(fileName)) {

      if(input == null) throw new RuntimeException("Config file not found " + fileName);

      configService.load(input);

    } catch (IOException e) {
      throw new RuntimeException("Error at reading config file", e);
    }
  }

  public String get(String key) {
    return this.configService.getProperty(key);
  }

}
