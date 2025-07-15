package com.model;

import com.inter.BankAccount;

public class CajeroAutomatico extends BankAccount {
  public CajeroAutomatico(String c, int value, int type) {
    proccess(c, value, type);
  }

  @Override
  public void confirm() {
    System.out.println("Transaccion realizada");
  }
}
