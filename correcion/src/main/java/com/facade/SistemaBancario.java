package com.facade;

import com.factory.FactoryImpl;
import com.inter.CuentaBancaria;

public class SistemaBancario {
	
	public void mostrarSaldo(CuentaBancaria banco) {
		
		CuentaBancaria cuenta = banco;
        cuenta.consultaSaldo(cuenta);
    }

    public void transferir(CuentaBancaria banco, CuentaBancaria destino, double monto) {

        TransferenciasBancarias  trans = new TransferenciasBancarias(banco, destino);
        trans.transferir(monto);
    }

}
