package com.impl;

import com.annotation.Adapter;

@Adapter(method = "driveCar")
public class Car {
    public void driveCar() {
        System.out.println("Car is driving");
    }
}
