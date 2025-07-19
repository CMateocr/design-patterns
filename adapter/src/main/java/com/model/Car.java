package com.model;

import com.inter.Vehicle;

public class Car implements Vehicle {
  private String name;

  public Car(String name) {
    this.name = name;
  }

  @Override
  public void drive() {
    System.out.println("Driving car called: " + name);
  }
}
