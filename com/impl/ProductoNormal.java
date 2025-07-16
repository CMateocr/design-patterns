package com.impl;

import com.inter.IVisitable;
import com.inter.IVisitor;

public class ProductoNormal implements IVisitable {
  private double precio;

  @Override
  public double accept(IVisitor visitor) {
    return visitor.visit(this);
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }
}
