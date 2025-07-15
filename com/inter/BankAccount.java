package com.inter;

public abstract class BankAccount {
  private String account;
  private int balance;

  private void setAccount(String account) {
    this.account = account;
  }

  private void deposit(int value) {
    System.out.println("Depositando");
    this.balance += value;
  }

  private void whithdraw(int value) {
    System.out.println("Verificando ");
    if(value <= balance-10) {
      this.balance -= value;
    } else {
      System.out.println("Saldo insuficiente");
    }
  }

  private void getBalance() {
    System.out.println("Your current balance is " + this.balance);
  }

  protected void audit() {
    System.out.println("Se ha procesado la transaccion en la cuenta: " + this.balance);
  }

  public abstract void confirm();
  public void proccess(String c, int value, int type){
    confirm();
    setAccount(c);
    switch (type) {
      case 1:
        deposit( value );
        break;
      case 2:
        whithdraw( value );
        break;
      default:
        System.out.println("Opcion no valida");
    }
    getBalance();
    audit();
  }
}
