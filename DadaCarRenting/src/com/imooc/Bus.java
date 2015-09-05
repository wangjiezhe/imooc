package com.imooc;

public class Bus extends CarryPassengers {
	{
		if (numPassengers() < 10) {
			System.out.println("This is not a bus");
		}
	}

	public Bus(String name, int price, int numPass) {
		super(name, price, numPass);
	}

	@Override
	public String toString() {
		return "Bus [name=" + name + ", price=" + price + ", numPassengers()=" + numPassengers() + "]";
	}

}
