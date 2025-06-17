package com.impl;

import com.inter.ProductTask;
import com.model.Product;

public class PrintProductTask implements ProductTask {
  @Override
  public void execute(Product product) {
    System.out.println(product);
  }
}
