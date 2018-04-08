package Exc_2_1;

public class Distance_01 {

  public Point point1; //точка 1.
  public Point point2; //точка 2.
  public Point point3; //точка 3.
  public Point point4; //точка 4.

  public static void main(String[] args) {

    Point p = new Point(5, 7, 3, 4);
    System.out.println("Расстояние между точками p1 и p2 = " +  p.distance());
  }

}
