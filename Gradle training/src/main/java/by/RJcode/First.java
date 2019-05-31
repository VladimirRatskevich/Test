package by.RJcode;

public class First {

  public static void main(String[] args) {
    hello("valodya");

    Square s = new Square(5);
    System.out.println("Площадь kvadrata so storonoy " + s.l + " = " + s.area());


    Rectangle r = new Rectangle(4,6);
    System.out.println("Ploshad' pramougolnika so storonami " + r.a + " and " + r.b + " = " + r.area());
  }

  public static void hello(String somebody) {
    System.out.println("Olololo " + somebody + "!");
  }





}