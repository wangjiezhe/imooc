package com.imooc;

public class LightLKW extends CarryCargo {
	{
		if (weightCargo() <= 0 || weightCargo() >= 5) {
			System.out.println("This is not a Light-LKW");
		}
	}

	public LightLKW(String name, int price, int capacity) {
		super(name, price, capacity);
	}

	@Override
	public String toString() {
		return "LightLKW [name=" + name + ", price=" + price + ", weightCargo()=" + weightCargo() + "]";
	}

}
