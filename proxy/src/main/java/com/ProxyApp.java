package com;

import com.dinamico.CadenaInvocationHandler;
import com.dinamico.ProxyFactory;
import com.impl.OperacionCadenaImpl;
import com.impl.OperacionNumeroImpl;
import com.inter.IOperacionCadena;
import com.inter.IOperacionNumeros;

public class ProxyApp {
  public static void main(String[] args) {
    IOperacionCadena operacionCadena = new OperacionCadenaImpl();

    IOperacionNumeros operacionNumeros = new OperacionNumeroImpl();

    ProxyFactory.register(IOperacionNumeros.class, OperacionNumeroImpl.class);
    ProxyFactory.register(IOperacionCadena.class, OperacionCadenaImpl.class);

    IOperacionCadena cadena = ProxyFactory.create(IOperacionCadena.class, CadenaInvocationHandler.class);

    String txt = cadena.upper("hola");
    System.out.println(txt);
  }
}
