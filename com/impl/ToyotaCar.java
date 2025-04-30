package com.impl;

import com.inter.BasicCar;

public class ToyotaCar extends BasicCar {
	public ToyotaCar(String m) {
		this.modelName = m; 
	}
	
	@Override
	public BasicCar clone() throws CloneNotSupportedException {
		return (ToyotaCar) super.clone(); 
	}
}
