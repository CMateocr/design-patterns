package com.model;

import com.anotaciones.MiAnotacion;


public class BancoA {
	private static int id;
	private Clientes cl;
	private int numCta;
	private double saldoAc;
	static{
		id = 1250;
	}
	
	public BancoA(Clientes cl, double saldo) {
		this.numCta = id++;
		this.cl = cl;
		this.saldoAc = saldo;
	}
	public BancoA() {
		this.numCta = id++;
	}
	public double consultarCta() {
		return saldoAc;
	}

	public boolean retiroCta(double monto) {
		if(monto < saldoAc) {
			saldoAc-= monto;
			return true;
		}
		else {
			System.out.println(this.getClass().getSimpleName() +" Saldo insuficiente ");
			return false;
		}	
	}
	
	public void deposito(double monto) {
		saldoAc += monto;
		System.out.println(this.getClass().getSimpleName() +" Deposito realizado, su saldo es: " + saldoAc);
	}
	public double getSaldo() {
		return saldoAc;
	}
	public void setCl(Clientes cl) {
		this.cl = cl;
	}
	
	
}
