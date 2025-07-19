package com;

import com.impl.Factory;
import com.inter.IFactory;
import com.model.Animal;
import com.model.Person;
import com.model.Thing;

public class Main {
  public static void main(String[] args) {
    IFactory factory = new Factory();
    factory.init("com.model");

    Object person = factory.create(Animal.class);

    System.out.println(person);
  }
}