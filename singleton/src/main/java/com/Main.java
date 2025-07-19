package com;

import com.config.ConfigLoader;
import com.model.DatabaseConnection;

import java.sql.Connection;
import java.util.Properties;

public class Main {
  public static void main(String[] args) {
    Properties p = ConfigLoader.loadProperties("config.properties");

    DatabaseConnection db = DatabaseConnection.getInstance(p.getProperty("URL"), p.getProperty("USER"), p.getProperty("PASSWORD"));

    Connection connection = db.getConnection();
    db.closeConnection();
  }
}