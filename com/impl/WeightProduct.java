package com.impl;

import com.inte.IPrice;

public class WeightProduct implements IPrice {

  private String name;
  private String category;
  private double weightPrice;
  private double weight;

  public WeightProduct(String name, String category, double weightPrice, double weight) {
    this.name = name;
    this.category = category;
    this.weightPrice = weightPrice;
    this.weight = weight;
  }

  @Override
  public double getFullPrice() {
    return weightPrice * weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setWeightPrice(double weightPrice) {
    this.weightPrice = weightPrice;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setName(String name) {
    this.name = name;
  }
}
