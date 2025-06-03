package com.model;

import java.util.Scanner;

public class Menu {
  Scanner sc = new Scanner(System.in);

  Tamagotchi tamagotchi = new Tamagotchi();

  public Menu() {}

  public void display() {
    int option = 0;

    String message = "Escoja una opcion: 1) Alimentar 2) Dormir 3) Jugar 4) Salir";

    do {
      System.out.println( message );
      option = sc.nextInt();

      switch ( option ) {
        case 1:
          tamagotchi.feed();
          break;
        case 2:
          tamagotchi.sleep();
          break;
        case 3:
          tamagotchi.play();
          break;
        case 4:
          System.out.println("Saliendo");
          break;
        default:
          System.out.println("Saliendo");
      }
    } while (option != 4);
  }
}
