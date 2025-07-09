package com;

import com.inter.Memento;
import com.model.Caretaker;
import com.model.Originator;

public class Main {
  public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();

    originator.setName("State1");
    caretaker.addMemento(originator.saveMemento());

    originator.setName("State2");
    caretaker.addMemento(originator.saveMemento());

    originator.setName("State3");
    caretaker.addMemento(originator.saveMemento());

    System.out.println("Current State: " + originator.getName());

    Memento m = caretaker.getMemento(0);

    originator.restoreMemento( m );

    System.out.println(originator.getName());
  }
}