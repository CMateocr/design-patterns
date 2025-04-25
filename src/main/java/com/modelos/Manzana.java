package com.modelos;

import com.anotaciones.MiComponente;

@MiComponente(name = "manzana")
public class Manzana extends Producto {

    public Manzana() {
        super(0, "manzana", 120, 15); // valores por defecto
    }

    public Manzana(int id, int precio, int cantidad) {
        super(id, "manzana", precio, cantidad);
    }
}
