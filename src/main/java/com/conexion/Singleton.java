package com.conexion;


import com.anotaciones.MiComponente;

@MiComponente(name = "ProductServices")
public class Singleton {
	private static Singleton instance = null;
	private static DbConfig dbCon = null;
	
	private Singleton() {
		try {
			var dbCon = Singleton.dbCon.getConnection();
			System.out.println("Conectado sing");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static Singleton getInstante() {
		Singleton.dbCon = new DbConfig();
		if(instance == null) instance = new Singleton();
		else System.out.println("Se devolvió instancia");
		return instance;
	}
	
	public DbConfig dbConfig() {
		return dbCon;
	}
}