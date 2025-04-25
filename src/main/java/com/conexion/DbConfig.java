package com.conexion;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DbConfig {
	private HikariDataSource ds;
	private HikariConfig config = new HikariConfig();
	{
		System.out.println("creando");
		config.setJdbcUrl("jdbc:sqlite:ejerciciodb.db");
		config.setUsername("");
		config.setPassword("");
		config.setConnectionTimeout(3000);
		ds = new HikariDataSource(config);
	}
	public Connection getConnection() {
		try {
			return ds.getConnection();
		} catch(SQLException e)
		{
			throw new RuntimeException(e);
		}
	}
}
