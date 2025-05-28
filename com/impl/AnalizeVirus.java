package com.impl;

import com.inter.IAnalize;
import com.model.Type;

public class AnalizeVirus {
  private IAnalize analysis;

  public AnalizeVirus(Type type) {
    factory(type.name().toLowerCase());
  }

  public void factory(String type) {
    switch (type) {
      case "complete":
        analysis = new CompleteAntivirus();
        break;
      case "fast":
        analysis = new FastAntivirus();
        break;
      default:
        throw new IllegalArgumentException("Unknown analysis type: " + type);
    }
  }

  public void analize() {
    analysis.analize();
  }

}
