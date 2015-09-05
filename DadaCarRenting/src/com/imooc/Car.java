package com.imooc;

public class Car extends CarryPassengers {
	{
		if (numPassengers() < 0 || numPassengers() >= 10) {
			System.out.println("THis is not a car");
		}
	}

	public Car(String name, int price, int numPass) {
		super(name, price, numPass);
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + ", numPassengers()=" + numPassengers() + "]";
	}
}
