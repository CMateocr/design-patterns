package com.model;

import com.anotaciones.MiAnotacion;
import com.inter.CuentaBancaria;

@MiAnotacion(name="B")
public class BancoB implements CuentaBancaria{
	
	private static int id;
	private Clientes cl;
	private int cuentaBancaria;
	private double saldoCta;
	static{
		id = 1250;
	}
	
	public BancoB(Clientes cl, double saldo) {
		this.cuentaBancaria = id++;
		this.cl = cl;
		this.saldoCta = saldo;
	}
	public BancoB() {
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
		
	}
	public double getSaldo() {
		return saldoCta;
	}
	public void setCl(Clientes cl) {
		this.cl = cl;
	}
	

}
