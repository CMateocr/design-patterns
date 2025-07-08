package com.impl;

import com.inter.Expressions;

import java.util.Map;

public class Variable implements Expressions {
  private String name;

  public Variable(String name) {
    this.name = name;
  }

  @Override
  public int interprete(Map<String, Integer> variables) {
    return variables.get( name );
  }
}
