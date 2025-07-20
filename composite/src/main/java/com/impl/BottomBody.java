package com.impl;

import com.inter.IEntity;

public class BottomBody implements IEntity {

  private String bottomPart;

  public BottomBody(String part) {
    this.bottomPart = part;
  }

  @Override
  public void render() {
    System.out.println("Bottom body part " + bottomPart + " rendered");
  }

  public void setBottomPart(String bottomPart) {
    this.bottomPart = bottomPart;
  }
}
