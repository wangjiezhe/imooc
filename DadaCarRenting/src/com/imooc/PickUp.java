package com.imooc;

public class PickUp extends Auto implements ICarryCargo, ICarryPassengers {
	private int numPass;
	private int capacity;

	public PickUp(String name, int price, int numPass, int capacity) {
		super(name, price);
		this.numPass = numPass;
		this.capacity = capacity;
	}

	@Override
	public int numPassengers() {
		return numPass;
	}

	@Override
	public int weightCargo() {
		return capacity;
	}

	@Override
	public void run() {
		System.out.println("This is a vehicle to carry passengers and cargo");
	}

	@Override
	public String toString() {
		return "PickUp [numPass=" + numPass + ", capacity=" + capacity + ", name=" + name + ", price=" + price
				+ ", numPassengers()=" + numPassengers() + ", weightCargo()=" + weightCargo() + "]";
	}

	@Override
	public String getLoad() {
		return "载人："+numPassengers()+"人"+" "+"载货："+weightCargo()+"吨";
	}

}
