package com.impl;

import com.inte.IPrice;

import java.util.ArrayList;
import java.util.List;

public class CompositeProduct implements IPrice {

  List<IPrice> products = new ArrayList<>();

  public void addProduct(IPrice product) {
    products.add( product );
  }
  
  public void removeProduct(IPrice product) {
    products.remove( product );
  }

  @Override
  public double getFullPrice() {
    double total = 0;

    for(var product : products) {
      total += product.getFullPrice();
    }

    return total;
  }

  public List<IPrice> getProducts() {
    return products;
  }
}
