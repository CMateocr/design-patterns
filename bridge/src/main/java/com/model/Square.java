package com.model;

import com.annotations.Component;
import com.inter.Figure;
import com.inter.IColor;

@Component(value = "square")
public class Square extends Figure {

  public Square(IColor color) {
    super(color);
  }

  @Override
  public void render() {
    System.out.println("cuadrado dibujandose");
    this.color.draw();
  }
}
