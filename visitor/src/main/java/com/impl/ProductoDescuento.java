package com.impl;


import com.inter.IVisitable;
import com.inter.IVisitor;

public class ProductoDescuento implements IVisitable {
  private double price;

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public void accep(IVisitor visitor) {
    visitor.visit( this );
  }
}
