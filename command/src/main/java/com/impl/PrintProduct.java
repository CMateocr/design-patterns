package com.impl;

import com.inter.Command;
import com.model.Product;

public class PrintProduct implements Command {
  @Override
  public void execute(Product obj) {
    System.out.println( obj );
  }
}
