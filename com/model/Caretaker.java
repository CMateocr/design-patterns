package com.model;

import com.inter.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
  private List<Memento> states = new ArrayList<>();

  public void addMemento(Memento memento) {
    states.add(memento);
  }

  public Memento getMemento(int index) {
    if (index < 0 || index >= states.size()) {
      throw new IndexOutOfBoundsException("Invalid index for memento retrieval.");
    }
    return states.get(index);
  }
}
