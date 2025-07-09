package com.model;

import com.inter.Memento;

public class Originator {
  private String name;

  public Memento saveMemento() {
    System.out.println("Originator: Saving to Memento.");
    return new Memento(name);
  }

  public void restoreMemento(Memento memento) {
    this.name = memento.getState();
    System.out.println("Originator: State after restoring from Memento: " + name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    new Memento(name);
  }
}
