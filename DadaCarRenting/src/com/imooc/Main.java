package com.imooc;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("欢迎使用答答租车系统");
    System.out.println("您是否要租车：1.是 0.否");
    int ifRent = sc.nextInt();
    if (ifRent != 1) {
      System.out.println("感谢您使用答答租车系统！");
      System.exit(0);
    }

    System.out.println("您可租车的类型和价目表：");
    Auto[] Cars = {
        new Car("奥迪A4", 500, 4),
        new Car("马自达6", 400, 4),
        new PickUp("皮卡雪6", 450, 4, 2),
        new Bus("金龙", 800, 20),
        new LightLKW("松花江", 400, 4),
        new WeightLKW("依维柯", 1000, 20)
    };
    String[] Columns = {
        "序号", "汽车名称", "租金", "容量"
    };
    String strFormat = "%-6s%-10s%-12s%-20s\n";
    System.out.printf(strFormat, Columns[0], Columns[1], Columns[2], Columns[3]);
    for (int i = 0; i < Cars.length; i++) {
      System.out.printf(strFormat, (i+1)+".", Cars[i].name, Cars[i].price+"元/天", Cars[i].getLoad());
    }

    System.out.println("请输入您要租车的数量：");
    int numRent = sc.nextInt();
    int[] rentCars = new int[numRent];
    for (int i = 0; i < numRent; i++) {
      System.out.println("请输入第"+(i+1)+"辆车的序号：");
      rentCars[i] = sc.nextInt();
    }
    System.out.println("请输入租车天数：");
    int rentDays = sc.nextInt();
    sc.close();

    System.out.println("您的账单：");

    System.out.println("***可载人的车有：");
    int totalPassengers = 0;
    for (int i:rentCars) {
      i--;
      if (Cars[i] instanceof CarryPassengers) {
        System.out.print("  "+Cars[i].name);
        totalPassengers += ((CarryPassengers)Cars[i]).numPassengers();
      } else if (Cars[i] instanceof PickUp) {
        System.out.print("  "+Cars[i].name);
        totalPassengers += ((PickUp)Cars[i]).numPassengers();
      }
    }
    System.out.print("    "+"共载人："+totalPassengers+"人\n");

    System.out.println("***可载货的车有：");
    float totalCargo = 0;
    for (int i:rentCars) {
      i--;
      if(Cars[i] instanceof CarryCargo) {
        System.out.print("  "+Cars[i].name);
        totalCargo += ((CarryCargo)Cars[i]).weightCargo();
      } else if (Cars[i] instanceof PickUp) {
        System.out.print("  "+Cars[i].name);
        totalCargo += ((PickUp)Cars[i]).weightCargo();
      }
    }
    System.out.print("    "+"共载货："+totalCargo+"吨\n");

    float totalPrice = 0;
    for (int i:rentCars) {
      i--;
      totalPrice += Cars[i].price;
    }
    totalPrice *= rentDays;
    System.out.println("***租车总价格："+totalPrice+"元");

  }

}
