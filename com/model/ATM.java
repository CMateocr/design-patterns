package com.model;

import com.inter.BankAccount;

public class ATM extends BankAccount {

  public ATM(String c, int value, int type) {
    super.proccess(c, value, type);
  }

  @Override
  public void confirm() {
    System.out.println("Bienvenido, que transaccion quiere realizar");
  }

  @Override
  public void audit() {
    System.out.println("Fue un placer atenderlo, regrese pronto");
  }
}
