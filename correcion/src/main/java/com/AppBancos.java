package com;

import com.adapter.BancoAdapterA;
import com.facade.SistemaBancario;
import com.factory.FactoryImpl;
import com.model.BancoB;
import com.model.BancoC;
import com.model.Clientes;

public class AppBancos {

	public static void main(String[] args) {
		FactoryImpl factory = new FactoryImpl();
		BancoB bancoB = factory.crearte("B");
		bancoB.deposito(500.0);
		bancoB.setCl(Clientes.Ana);
		BancoAdapterA bancoA = factory.crearte("A");
		bancoA.deposito(2000.0);
		bancoA.getBanco().setCl(Clientes.Juan);
		BancoC bancoC = factory.crearte("C");
		bancoC.deposito(1780.0);
		bancoC.setCl(Clientes.Carlos);
		SistemaBancario sb = new SistemaBancario();
		sb.mostrarSaldo(bancoB);
		sb.transferir(bancoA, bancoC, 200.0);
		sb.mostrarSaldo(bancoA);
		sb.mostrarSaldo(bancoC);

	}

}
