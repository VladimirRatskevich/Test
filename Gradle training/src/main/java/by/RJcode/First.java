package by.RJcode;

public class First {

  public static void main(String[] args) {
    hello("valodya");

    double len = 5;
    System.out.println("Площадь kvadrata so storonoy " + len + " = " + area(len));

    double a = 4;
    double b = 5;
    System.out.println("Ploshad' pramougolnika so storonami " + a + " and " + b + " = " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Olololo " + somebody + "!");
  }

  public static double area (double l) {
    return  l * l;
  }

  public static double area (double a, double b) {
    return a*b;
  }

}