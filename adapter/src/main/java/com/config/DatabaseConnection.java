package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
  private static DatabaseConnection instance;

  private Connection connection;

  private DatabaseConnection(String url, String user, String password) {
    try {
      this.connection = DriverManager.getConnection( url, user, password );
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public static DatabaseConnection getInstance(String url, String user, String password) {
    if( instance == null ) {
      return new DatabaseConnection(url, user, password);
    }

    return instance;
  }

  public Connection getConnection() {
    return connection;
  }

  public void closeConnection() {
    try {
      connection.close();
      instance = null;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
