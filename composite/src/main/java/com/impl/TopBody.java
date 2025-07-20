package com.impl;

import com.inter.IEntity;

public class TopBody implements IEntity {
  private String topPart;

  public TopBody(String topPart) {
    this.topPart = topPart;
  }

  @Override
  public void render() {
    System.out.println("Top body part " + topPart + " rendered");
  }

  public void setTopPart(String topPart) {
    this.topPart = topPart;
  }
}
