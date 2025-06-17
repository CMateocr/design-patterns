package com.impl;

import com.inter.ProductTask;
import com.model.Product;

public class ValidateProductTask implements ProductTask {
  @Override
  public void execute(Product product) {
    if(product.getValue() > 100.0 && product.getValue() < 1000.0) {
      System.out.println("Product valid for discount");
      return;
    }

    System.out.println("Product not valid for discount");
  }
}
