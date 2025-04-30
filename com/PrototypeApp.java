package com;

import com.impl.FordCar;
import com.impl.ToyotaCar;
import com.inter.BasicCar;

public class PrototypeApp {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		
		BasicCar toyota = new ToyotaCar("Corolla Hybrid");
		
		BasicCar ford = new FordCar("Ford explorer");
		
		toyota.price = 3500;
		ford.price = 12233;
		
		BasicCar fordClone = ford.clone();
		BasicCar toyotaClone = toyota.clone();
		
		System.out.println(toyotaClone);
		
		toyotaClone.price = toyotaClone.price + toyotaClone.setPrice(toyotaClone.price);
		
		System.out.println(fordClone);
	}
	
}
