package com.impl;

import com.inter.Command;
import com.model.Product;

public class SendEmailTask implements Command {
  @Override
  public void execute(Product p) {
    System.out.println("sending email with product " + p.name());
  }
}
