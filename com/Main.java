package com;

import com.inter.IState;
import com.model.Menu;

public class Main {
  public static void main(String[] args) {
    IState.state.subscribe();
    Menu menu = new Menu();

    menu.display();
  }
}