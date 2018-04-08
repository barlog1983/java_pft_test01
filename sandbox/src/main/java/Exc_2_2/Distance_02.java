package Exc_2_2;

public class Distance_02 {

  public Point point1; //точка 1.
  public Point point2; //точка 2.

  public double distance(Point p1, Point p2) {
    return Math.sqrt(Math.pow((p2.p1 - p1.p1), 2) + Math.pow((p2.p2 - p1.p2), 2));
  }

  public static void main(String[] args) {
    Point p1 = new Point(4, 0);
    Point p2 = new Point(9, 0);
    Distance_02 D = new Distance_02();
    System.out.println("1");
    System.out.println("Расстояние между точками p1 и p2 = " +  D.distance(p1, p2));
  }
}
