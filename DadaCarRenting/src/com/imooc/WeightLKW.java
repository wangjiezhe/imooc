package com.imooc;

public class WeightLKW extends CarryCargo {
	{
		if (weightCargo() < 5) {
			System.out.println("This is not a Weight_LKW");
		}
	}

	public WeightLKW(String name, int price, int capacity) {
		super(name, price, capacity);
	}

	@Override
	public String toString() {
		return "WeightLKW [name=" + name + ", price=" + price + ", weightCargo()=" + weightCargo() + "]";
	}

}
