package Exc_2_4;

public class Distance {

  public Point point1; //точка 1.
  public Point point2; //точка 2.

  public static void main(String[] args) {
    Point p1 = new Point(1, 3);
    Point p2 = new Point(5, 10);
    System.out.println("1");
    System.out.println("Расстояние между точками p1 и p2 = " +  p1.distance(p2));
  }
 }

