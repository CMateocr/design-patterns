package com.impl;

import com.inter.Expressions;

import java.util.Map;

public class Number implements Expressions {
  private int number;

  public Number(int number) {
    this.number = number;
  }

  @Override
  public int interprete(Map<String, Integer> variables) {

    return number;
  }
}
