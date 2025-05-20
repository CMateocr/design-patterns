package com.impl;

import com.inte.IPrice;

public class UnitProduct implements IPrice {

  private String name;
  private String category;
  private double price;
  private int quantity;

  public UnitProduct(String name, String category, double price, int quantity) {
    this.name = name;
    this.category = category;
    this.price = price;
    this.quantity = quantity;
  }

  @Override
  public double getFullPrice() {
    return price * quantity;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
