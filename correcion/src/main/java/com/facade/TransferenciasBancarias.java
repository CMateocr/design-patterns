package com.facade;

import com.inter.CuentaBancaria;

public class TransferenciasBancarias {
	private CuentaBancaria cuentaOrg;
	private CuentaBancaria cuentaDes;
	
	public TransferenciasBancarias(CuentaBancaria cuentaOrg, CuentaBancaria cuentaDes ) {
		this.cuentaOrg = cuentaOrg;
		this.cuentaDes = cuentaDes;
	}
	
	public void transferir(double monto) {
		if(cuentaOrg.getSaldo()> monto) {
			cuentaOrg.retiro(monto);
			cuentaDes.deposito(monto);
		}	
		
	}

}
