package com.inter;

public interface CuentaBancaria {
	void consultaSaldo(CuentaBancaria cta);
	void retiro(double monto);
	void deposito(double monto);
	double getSaldo();

}
