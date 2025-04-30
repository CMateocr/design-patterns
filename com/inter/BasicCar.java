package com.inter;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
	
	protected String modelName;
	public int price;
	
	public BasicCar() {}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public int setPrice(int price) {
		int p = 0;
		
		Random r = new Random();
		
		p = r.nextInt(10000);
		
		return p;
	}
	
	public BasicCar clone() throws CloneNotSupportedException {
		return (BasicCar) super.clone();
	}
	
	
}
