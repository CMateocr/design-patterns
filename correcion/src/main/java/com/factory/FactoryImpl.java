package com.factory;


import com.adapter.BancoAdapterA;
import com.model.BancoA;
import com.model.BancoB;
import com.model.BancoC;


public class FactoryImpl implements IFactory{

	@Override
	public <T> T crearte(String name) {
		Object ret = null;
		
		switch (name) {
		case "A":
			ret = new BancoAdapterA(new BancoA());
			break;
		case "B":
			ret = new BancoB();
			break;
		case "C":
			ret = new BancoC() ;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + name);
		}
	/*	if(name.equals("pc")) {
			//ret = new 
		}*/
		return (T)ret;
	}


}
