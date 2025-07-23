package com;

import com.impl.IVA;
import com.impl.ProductoDescuento;
import com.impl.ProductoNormal;

public class VisitorApp {
  public static void main(String[] args) {
    ProductoDescuento p1 = new ProductoDescuento();
    ProductoNormal p2 = new ProductoNormal();

    p1.setPrice(18.9);
    p2.setPrice(18.9);

    IVA iva = new IVA();

    p1.accep( iva );
    p2.accep( iva );
  }
}
