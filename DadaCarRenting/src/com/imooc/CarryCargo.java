package com.imooc;

public class CarryCargo extends Auto implements ICarryCargo {
  private int capacity;

  public CarryCargo(String name, int price, int capacity) {
    super(name, price);
    this.capacity = capacity;
  }

  @Override
  public int weightCargo() {
    return capacity;
  }

  @Override
  public void run() {
    System.out.println("This is a vehicle to carry cargo");
  }

  @Override
  public String toString() {
    return "CarryCargo [name=" + name + ", price=" + price + ", weightCargo()=" + weightCargo() + "]";
  }

  @Override
  public String getLoad() {
    return "载货："+weightCargo()+"吨";
  }

}
