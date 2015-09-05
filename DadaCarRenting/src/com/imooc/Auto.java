package com.imooc;

public abstract class Auto {
	public String name;
	public int price;
	
	public Auto(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public abstract void run();
	public abstract String getLoad();
}
