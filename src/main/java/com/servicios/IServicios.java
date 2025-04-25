package com.servicios;


import java.util.List;

import com.conexion.DbConfig;
import com.modelos.Producto;

public interface IServicios {
    void create(Producto p);
    Producto read(int id);
    List<Producto> listar();
//    void update(Producto p);
//    void delete(int id);
}