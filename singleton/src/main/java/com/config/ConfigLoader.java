package com.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigLoader {
  public static Properties loadProperties(String filePath) {
    Properties properties = new Properties();
    try {
      InputStream input = ConfigLoader.class.getClassLoader().getResourceAsStream(filePath);
      properties.load( input );
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    return properties;
  }


}
