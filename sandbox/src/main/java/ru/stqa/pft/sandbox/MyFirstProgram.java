package ru.stqa.pft.sandbox;

public class MyFirstProgram {


  public static void main(String[] args) {
    String name;
    double l = 5;
    double a = 8;
    double b = 7;
    System.out.println("площадь прямоугольника со сторонами 8 и 7 равна " + area(a, b));
    System.out.println("площадь квадрата со стороной 5, равна " + area(l));
    helo("vasja");
  }

  public static void helo(String name) {
    System.out.println("Hello, " + name);
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }
}
	