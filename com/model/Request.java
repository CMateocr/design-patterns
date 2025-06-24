package org.com.model;

public class Request {
  private double amount;
  private String description;

  public Request(double amount, String description) {
    this.amount = amount;
    this.description = description;
  }

  public double getAmount() {
    return amount;
  }

  public String getDescription() {
    return description;
  }
}
