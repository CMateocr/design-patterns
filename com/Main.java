package com;

import com.adapter.Adaptable;
import com.annotation.Adapter;
import com.impl.Car;
import com.impl.Crane;
import com.inter.Vehicle;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) throws NoSuchMethodException {
    Car car = new Car();

    Crane crane = new Crane();

    Vehicle carAdapter = new Adaptable<>(car);

    Vehicle craneAdapter = new Adaptable<>(crane);

    List<Object> vehicles = Arrays.asList(new Car(), new Crane());

    List<Adaptable<Object>> newVehicles = vehicles
            .stream()
            .filter(obj -> obj.getClass().isAnnotationPresent(Adapter.class))
            .map((obj) -> {
              try {
                return new Adaptable<>(obj);
              } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
              }
            })
            .toList();

    newVehicles.forEach(Vehicle::drive);
  }
}