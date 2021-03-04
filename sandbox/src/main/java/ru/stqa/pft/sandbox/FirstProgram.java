package ru.stqa.pft.sandbox;

public class FirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Lpva");

    double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + " равна " + area (len));
    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " равна " + area (a,b));

  }
    public static void hello (String sombody) {

      System.out.println("Hello, "+ sombody +"!");
    }
    public static double area (double l) {
    return l*l;
    }
    public static double area (double a, double b) {
    return a*b;

    }
}

