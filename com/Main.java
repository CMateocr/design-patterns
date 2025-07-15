package com;

import com.model.ATM;
import com.model.CajeroAutomatico;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ATM cajero = new ATM("CTA. 123", 100, menu());
    cajero.proccess("CTA. 123", 25, menu());

    CajeroAutomatico ca = new CajeroAutomatico("CTA. 877", 40,menu());
//    ca.proccess("CTA. 877", 25, menu());
  }

  public static int menu() {
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese una opcion: " +
            "1. Depositar" +
            "2. Retirar");

    return sc.nextInt();
  }
}