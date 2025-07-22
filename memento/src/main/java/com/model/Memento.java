package com.model;

public class Memento {
  private String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return this.state;
  }

  public void setState(String newState) {
    this.state = newState;
  }

  @Override
  public String toString() {
    return "Memento{" +
            "state='" + state + '\'' +
            '}';
  }
}
