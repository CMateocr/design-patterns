package com.impl;

import com.inter.Command;
import com.model.Product;

public class ApplyDiscount implements Command {
  @Override
  public void execute(Product p) {
    if(p.price() <= 300) {
      System.out.println(p + " not valid for discount");
      return;
    }

    System.out.println(p + " valid for discount");

  }
}
