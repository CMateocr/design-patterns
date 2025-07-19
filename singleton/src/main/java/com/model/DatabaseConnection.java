package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
  private static DatabaseConnection instance;

  private Connection connection;

  private String url;
  private String user;
  private String password;

  private DatabaseConnection(String url, String user, String password) {
    this.url = url;
    this.user = user;
    this.password = password;

    try {
      this.connection = DriverManager.getConnection( url, user, password );
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  public static DatabaseConnection getInstance(String url, String user, String password) {
    if(instance == null) {
      return new DatabaseConnection(url, user, password);
    }

    return instance;
  }

  public Connection getConnection() {
    return connection;
  }

  public void closeConnection() {
    if(connection == null) return;

    try {
      connection.close();
      instance = null;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }
}
