package com;

import com.impl.Number;
import com.impl.Product;
import com.impl.Sum;
import com.impl.Variable;
import com.inter.Expressions;

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {

    Map<String, Integer> variables = new HashMap<>();

    variables.put("x", 3);
    variables.put("y", 7);
    variables.put("z", 9);

    Expressions uno = new Sum(new Variable("x"), new Number(4));
    Expressions dos = new Product(uno, new Variable("y"));

    System.out.println(dos.interprete(variables));
  }
}