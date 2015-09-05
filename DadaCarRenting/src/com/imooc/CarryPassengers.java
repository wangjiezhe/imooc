package com.imooc;

public class CarryPassengers extends Auto implements ICarryPassengers {
	private int numPass;

	public CarryPassengers(String name, int price, int numPass) {
		super(name, price);
		this.numPass = numPass;
	}

	@Override
	public int numPassengers() {
		return numPass;
	}

	@Override
	public void run() {
		System.out.println("This is a vehicle to carry passengers");
	}

	@Override
	public String toString() {
		return "CarryPassengers [name=" + name + ", price=" + price + ", numPassengers()=" + numPassengers() + "]";
	}

	@Override
	public String getLoad() {
		return "载人："+numPassengers()+"人";
	}

}
