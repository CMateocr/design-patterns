package com.impl;

import com.inter.ProductTask;
import com.model.Product;

public class SendEmailTask implements ProductTask {
  @Override
  public void execute(Product product) {
    System.out.println("Sending assigned email " + product.getName());
  }
}
