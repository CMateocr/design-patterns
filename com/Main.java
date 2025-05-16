package com;

import com.dinamico.OperacionesCadenas;
import static com.dinamico.OperacionesFactory.*;
import com.impl.OperacionesCadenasImpl;
import com.impl.OperacionesNumeroProxy;
import com.impl.UserRepository;
import com.inter.IOperacionesCadenas;
import com.inter.IUserRepository;
import com.inter.OperacionesNumeros;
import com.model.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        OperacionesNumeros on = OperacionesFactory.crearNumero(OperacionesNumeros.class);
//        var oc = OperacionesFactory.crearCadenas(IOperacionesCadenas.class);
//
//
//        int sol = on.sumar(1,2);
//
//        System.out.println(oc.may("hola mudno"));

        List<User> users = new ArrayList<>();

        registrar(IOperacionesCadenas.class, OperacionesCadenasImpl.class);

        var p = crear(IOperacionesCadenas.class);

        var s = p.may("aaa");

        registrar(IUserRepository.class, UserRepository.class);

        var repo = crear(IUserRepository.class);

        var user = repo.create("Cristian", "Paul");

        System.out.println(user);

    }
}