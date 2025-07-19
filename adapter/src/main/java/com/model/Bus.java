package com.model;

import com.annotations.InstanceMethod;

@InstanceMethod(name = "driveBus")
public class Bus {
  private String name;

  public Bus(String name) {
    this.name = name;
  }

  public void driveBus() {
    System.out.println("driving the bus called: " + name);
  }
}
