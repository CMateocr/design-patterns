package com;

import com.dinamico.OperacionesCadenas;
import com.dinamico.OperacionesFactory;
import com.impl.OperacionesCadenasImpl;
import com.impl.OperacionesNumeroProxy;
import com.inter.IOperacionesCadenas;
import com.inter.OperacionesNumeros;

public class Main {
    public static void main(String[] args) {
        OperacionesNumeros on = OperacionesFactory.crearNumero(OperacionesNumeros.class);
        var oc = OperacionesFactory.crearCadenas(IOperacionesCadenas.class);


        int sol = on.sumar(1,2);

        System.out.println(oc.may("hola mudno"));
    }
}
