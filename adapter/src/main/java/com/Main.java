package com;

import com.config.ConfigLoader;
import com.config.DatabaseConnection;
import com.impl.Adaptable;
import com.inter.Vehicle;
import com.model.Bus;
import com.model.Cab;
import com.model.Car;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Main {
  public static void main(String[] args) {

    Properties properties = ConfigLoader.loadProperties("config.properties");

    DatabaseConnection db = DatabaseConnection.getInstance(properties.getProperty("URL"), properties.getProperty("USER"), properties.getProperty("PASSWORD"));

    String createTableSQL = "CREATE TABLE IF NOT EXISTS usuarios (id INT AUTO_INCREMENT PRIMARY KEY, nombre VARCHAR(100) NOT NULL, edad INT)";

    Connection connection = db.getConnection();

    Bus bus = new Bus("bus");
    Cab cab = new Cab("cab");

    Vehicle busA = new Adaptable<>(bus);
    Vehicle cabA = new Adaptable<>(cab);
    Vehicle carA = new Car("car");

    busA.drive();
    cabA.drive();
    carA.drive();
  }
}