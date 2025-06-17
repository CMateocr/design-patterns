package com.model;

public class Product {
  private static int count;
  private int id;
  private String name;
  private double value;

  static {
    count = 124;
  }

  public Product(String name, double value) {
    this.id = count++;
    this.name = name;
    this.value = value;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Product{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", value=" + value +
            '}';
  }
}
