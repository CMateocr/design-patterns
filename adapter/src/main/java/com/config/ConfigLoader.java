package com.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {

  public static Properties loadProperties(String fileName) {
    Properties properties = new Properties();

    InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream(fileName);

    try {
      properties.load( input );
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return properties;
  }
}
