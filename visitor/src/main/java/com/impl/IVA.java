package com.impl;

import com.inter.IVisitor;

public class IVA implements IVisitor {
  private final double impNormal = 1.12;
  private final double impDescuento = 1.85;


  @Override
  public double visit(ProductoDescuento p) {
    var finalP = p.getPrice() * impDescuento;
    System.out.println(finalP);
    return finalP;
  }

  @Override
  public double visit(ProductoNormal p) {
    var finalP = p.getPrice() * impNormal;
    System.out.println(finalP);
    return finalP;
  }
}
