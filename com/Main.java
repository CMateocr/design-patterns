package com;

import com.impl.IVA;
import com.impl.ProductoDescuento;
import com.impl.ProductoNormal;

public class Main {
  public static void main(String[] args) {
    ProductoDescuento pd = new ProductoDescuento();
    pd.setPrecio(1250.0);

    ProductoNormal pn = new ProductoNormal();
    pn.setPrecio(875.89);

    IVA iva = new IVA();
    double total1 = pd.accept(iva);
    double total2 = pn.accept(iva);

    System.out.println("Total Producto Descuento: " + total1);
    System.out.println("Total Producto Normal: " + total2);
  }
}