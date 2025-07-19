package com.model;

import com.inter.CuentaBancaria;

public class BancoC implements CuentaBancaria{
	private static int id;
	private Clientes cl;
	private int cuentaBancaria;
	private double saldoCta;
	static{
		id = 1250;
	}
	
	public BancoC(Clientes cl, double saldo) {
		this.cuentaBancaria = id++;
		this.cl = cl;
		this.saldoCta = saldo;
	}

	public BancoC() {
		this.cuentaBancaria = id++;
	}
	@Override
	public void consultaSaldo(CuentaBancaria cta) {
		System.out.println(this.getClass().getSimpleName() +" El saldo de su cta es: " + saldoCta);
		
	}

	@Override
	public void retiro(double monto) {
		if(monto < saldoCta) {
			saldoCta-= monto;
			System.out.println(this.getClass().getSimpleName() +" Su retiro ha sido exitoso: monto descontado:  "+ monto);
		}
		else {
			System.out.println(" Saldo insuficiente ");

		}
		
	}

	@Override
	public void deposito(double monto) {
		saldoCta += monto;
		System.out.println(this.getClass().getSimpleName() +" Deposito realizado, su saldo es: " + saldoCta);
		
	}

	public double getSaldo() {
		return saldoCta;
	}

	public void setCl(Clientes cl) {
		this.cl = cl;
	}
	
}
