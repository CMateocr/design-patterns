package com.model;

import com.annotations.InstanceMethod;

@InstanceMethod(name = "driveCar")
public class Cab {

  private String name;

  public Cab(String name) {
    this.name = name;
  }

  public void driveCar() {
    System.out.println("Driving cab called: " + name);
  }
}
