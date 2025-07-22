package com.model;

import java.util.Stack;

public class Manager {
  private Stack<Memento> mementos = new Stack<>();

  public void saveMemento(Memento memento) {
    mementos.add( memento );
  }

  public Memento undo() {
    if(!mementos.isEmpty()) {
      System.out.println(mementos);
      return mementos.pop();
    }

    return null;
  }
}
