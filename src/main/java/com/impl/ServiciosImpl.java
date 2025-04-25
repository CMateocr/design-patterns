package com.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.conexion.DbConfig;
import com.conexion.Singleton;
import com.modelos.Producto;
import com.servicios.IServicios;

public class ServiciosImpl implements IServicios{
	
	private final DbConfig dbConfig;

    public ServiciosImpl() {
        this.dbConfig = Singleton.getInstante().dbConfig();
    }

	@Override
	public void create(Producto p) {
		try(var con = dbConfig.getConnection()) {
            var pst = con.prepareStatement("INSERT INTO productos (nombre, precio, cantidad) VALUES(?,?,?)");
            pst.setString(1, p.getNombre());
            pst.setInt(2, p.getPrecio());
            pst.setInt(3, p.getCantidad());

            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public Producto read(int id) {
		try (var con = dbConfig.getConnection()) {
	        var pst = con.prepareStatement("SELECT * FROM productos WHERE id = ?");
	        pst.setInt(1, id);
	        var rs = pst.executeQuery();
	        if (rs.next()) {
	            return new Producto(
	                rs.getInt("id"),
	                rs.getString("nombre"),
	                rs.getInt("precio"),
	                rs.getInt("cantidad")
	            );
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

	@Override
	public List<Producto> listar() {
		try (var con = dbConfig.getConnection()) {
	        var pst = con.prepareStatement("SELECT * FROM productos");
	        var rs = pst.executeQuery();
	        var lista = new ArrayList<Producto>();
	        while (rs.next()) {
	            lista.add(new Producto(
	                rs.getInt("id"),
	                rs.getString("nombre"),
	                rs.getInt("precio"),
	                rs.getInt("cantidad")
	            ));
	        }
	        return lista;
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return null;
	}

}
