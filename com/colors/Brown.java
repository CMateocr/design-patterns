package com.colors;

import com.annotation.Component;
import com.inter.IColor;

@Component(value = "brown")
public class Brown implements IColor {
  @Override
  public void draw(int border) {
    System.out.println("brown color " + border + " cm");
  }
}
