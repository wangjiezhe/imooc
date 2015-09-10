package com.imooc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Borrow {
  static String[] books = (new Books()).getBooks();

  @SuppressWarnings("serial")
  public static class BookNotExistException extends Exception {
    public BookNotExistException() {
      System.out.println("图书不存在!");
    }
  }

  public static void main(String[] args) {
//    for (String book:books) {
//      System.out.println(book);
//    }
    Scanner sc = new Scanner(System.in);
    int method;
    String result;
    while (true) {
      while (true) {
        try {
          System.out.println("输入命令： 1-按照名称查找图书; 2-按照序号查找图书");
          method = sc.nextInt();
          if (method == 1 || method == 2) {
            break;
          } else {
            throw new InputMismatchException();
          }
        } catch (InputMismatchException e) {
          System.out.println("命令输入错误！请根据提示输入数字命令！");
          sc.nextLine();
        }
      }
//      System.out.println(method);
      try {
        if (method == 2) {
          int id;
          while (true) {
            try {
              System.out.println("输入图书序号：");
              id = sc.nextInt();
              break;
            } catch (InputMismatchException e) {
              System.out.println("命令输入错误！请根据提示输入数字命令！");
              sc.nextLine();
            }
          }
          result = getBookById(id);
        } else {
          System.out.println("输入图书名称");
          String name = sc.next();
          System.out.println(name);
          result = getBookByName(name);
        }
        break;
      } catch (BookNotExistException e) {
        sc.nextLine();
      }
    }
    System.out.println("book: "+result);
    sc.close();
  }

  public static String getBookById(int id) throws BookNotExistException {
    try {
      return books[id-1];
    } catch (ArrayIndexOutOfBoundsException e) {
      throw new BookNotExistException();
    }
  }

  public static String getBookByName(String name) throws BookNotExistException {
    for (String book:books) {
      if (name.equals(book)) {
        return name;
      }
    }
    throw new BookNotExistException();
  }
}
