package com.impl;

import com.inter.IVisitor;

public class IVA implements IVisitor {
  private final double impNormal = 1.12;
  private final double impDescuento = 1.08;

  @Override
  public double visit(ProductoNormal normal) {
    return normal.getPrecio() * impNormal;
  }

  @Override
  public double visit(ProductoDescuento descuento) {
    return descuento.getPrecio() * impDescuento;
  }
}
