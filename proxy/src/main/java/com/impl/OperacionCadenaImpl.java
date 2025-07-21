package com.impl;

import com.inter.IOperacionCadena;

public class OperacionCadenaImpl implements IOperacionCadena {
  @Override
  public String upper(String text) {
    return text.toUpperCase();
  }
}
