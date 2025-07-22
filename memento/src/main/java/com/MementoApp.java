package com;

import com.model.Manager;
import com.model.StateEditor;

public class MementoApp {
  public static void main(String[] args) {
    Manager manager = new Manager();
    StateEditor editor = new StateEditor();

    editor.write("Hola");
    manager.saveMemento( editor.saveMemento() );

    editor.write(" Mundo");
    manager.saveMemento( editor.saveMemento() );

    editor.undo( manager.undo() );
    editor.undo( manager.undo() );
    editor.undo( manager.undo() );
    System.out.println(editor.getText());
  }
}
