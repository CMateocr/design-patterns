package com.adapter;

import com.anotaciones.MiAnotacion;
import com.inter.CuentaBancaria;
import com.model.BancoA;

@MiAnotacion(name="A")
public class BancoAdapterA implements CuentaBancaria{
	private BancoA banco;
	
	public BancoAdapterA(BancoA banco) {
		this.banco = banco;
	}

	@Override
	public void consultaSaldo(CuentaBancaria cta) {
		System.out.println(this.getClass().getSimpleName() 
				+" El saldo de su cta es: " +banco.consultarCta() );
		
	}

	@Override
	public void retiro(double monto) {
		System.out.println(this.getClass().getSimpleName() +
				(banco.retiroCta(monto)?
				" Su retiro ha sido exitoso: monto descontado:  " 
				+monto : " No fue posible realizar el retiro, monto insuficiente"));
	}

	@Override
	public void deposito(double monto) {
		banco.deposito(monto);
		
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return banco.getSaldo();
	}

	public BancoA getBanco() {
		return banco;
	}
	

}
