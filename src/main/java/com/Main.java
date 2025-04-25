package com;

import com.impl.FactoryImpl;
import com.impl.ServiciosImpl;
import com.modelos.Manzana;
import com.modelos.Pera;
import com.modelos.Producto;

public class Main {

	public static void main(String[] args) {
		
		FactoryImpl f = new FactoryImpl();
		
		f.init("com.modelos");
		f.create(Pera.class);
		
		Producto p1 = new Manzana(2, 4, 10);
		
		ServiciosImpl servicios = new ServiciosImpl();
		
		servicios.create(p1);
		var l = servicios.listar();
		System.out.println(l);
	}
}
