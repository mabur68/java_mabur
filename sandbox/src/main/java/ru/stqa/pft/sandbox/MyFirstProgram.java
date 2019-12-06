package ru.stqa.pft.sandbox;

public class MyFirstProgram {


  public static void main(String[] args) {
    Square s= new Square( 5);
    Rectangle r= new Rectangle(8,7);

    String name;

    System.out.println("площадь прямоугольника со сторонами "+r.a+" и "+ r.b+" равна " + area(r));
    System.out.println("площадь квадрата со стороной "+s.len+", равна " + area(s));
    helo("vasja");
  }

  public static void helo(String name) {
    System.out.println("Hello, " + name);
  }

  public static double area(Square s) {
    return s.len * s.len;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }
}
	