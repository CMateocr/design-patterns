package com.model;

public class StateEditor {
  private String text = "";

  public void write(String text) {
    this.text += text;
  }

  public String getText() {
    return this.text;
  }

  public Memento saveMemento() {
    return new Memento( this.text );
  }

  public void undo(Memento memento) {
    if( memento == null ) {
      this.text = "place holder";
      return;
    }
    this.text = memento.getState();
  }
}
