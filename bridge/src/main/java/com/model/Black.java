package com.model;

import com.annotations.Component;
import com.inter.IColor;

@Component(value = "black")
public class Black implements IColor {
  @Override
  public void draw() {
    System.out.println("drawing with black color");
  }
}
