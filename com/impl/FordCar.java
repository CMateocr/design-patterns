package com.impl;

import com.inter.BasicCar;

public class FordCar extends BasicCar {
	public FordCar(String m) {
		this.modelName = m; 
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return (FordCar) super.clone();
	}
}
