package com.impl;

import com.inter.Expressions;

import java.util.Map;

public class Division implements Expressions {
  private Expressions left;
  private Expressions right;

  public Division(Expressions left, Expressions right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interprete(Map<String, Integer> variables) {
    int divisor = right.interprete(variables);
    if(divisor == 0) {
      throw new ArithmeticException();
    }
    return left.interprete(variables) / right.interprete(variables);
  }
}
