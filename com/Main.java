package com;

import com.impl.AnalizeVirus;
import com.model.Type;

public class Main {
  public static void main(String[] args) {

    var context = new AnalizeVirus(Type.COMPLETE);

    context.analize();
  }
}