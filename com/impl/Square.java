package com.impl;

import com.annotation.Component;
import com.inter.Figure;
import com.inter.IColor;

@Component(value = "square")
public class Square extends Figure {
  public Square(IColor color) {
    super(color);
  }

  @Override
  public void drawFigure(int border) {
    System.out.println("Square is being drawn");
    this.color.draw(border);
  }

  @Override
  public void modifyBorder(int border, int increment) {
    System.out.println("border has changed");

    border *= increment;

    this.drawFigure(border);
  }
}
