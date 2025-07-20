package com.inter;

public abstract class Figure {
  protected IColor color;

  public Figure(IColor color) {
    this.color = color;
  }

  public abstract void render();
}
