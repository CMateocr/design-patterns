package com.modelos;

import com.anotaciones.MiComponente;

@MiComponente(name = "pera")
public class Pera extends Producto{
	
	public Pera() {
        super(0, "pera", 100, 10); 
    }

	public Pera(int id, int precio, int cantidad) {
		super(id, "pera", precio, cantidad);
	}
	
	

}
