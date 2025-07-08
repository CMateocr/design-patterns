package com.impl;

import com.inter.Expressions;

import java.util.Map;

public class Subtraction implements Expressions{
  private Expressions left;
  private Expressions right;

  public Subtraction(Expressions left, Expressions right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interprete(Map<String, Integer> variables) {
    return left.interprete(variables) - right.interprete(variables);
  }
}
