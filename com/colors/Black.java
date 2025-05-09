package com.colors;

import com.annotation.Component;
import com.inter.IColor;

@Component(value = "black")
public class Black implements IColor {
  @Override
  public void draw(int border) {
    System.out.println("black color " + border + " cm");
  }
}
