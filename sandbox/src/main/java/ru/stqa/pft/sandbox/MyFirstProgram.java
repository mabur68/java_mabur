package ru.stqa.pft.sandbox;

public class MyFirstProgram {


  public static void main(String[] args) {
    Square s= new Square( 6);
    Rectangle r= new Rectangle(8,7);

    String name;

    System.out.println("площадь прямоугольника со сторонами "+r.a+" и "+ r.b+" равна " + r.area());
    System.out.println("площадь квадрата со стороной "+s.len+", равна " + s.area());
    helo("vasja");
  }

  public static void helo(String name) {
    System.out.println("Hello, " + name);
  }




}
	