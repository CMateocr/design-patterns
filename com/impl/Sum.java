package com.impl;

import com.inter.Expressions;

import java.util.Map;

public class Sum implements Expressions {
  private Expressions left;
  private Expressions right;

  public Sum(Expressions left, Expressions right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public int interprete(Map<String, Integer> variables) {
    return left.interprete(variables) + right.interprete(variables);
  }
}
