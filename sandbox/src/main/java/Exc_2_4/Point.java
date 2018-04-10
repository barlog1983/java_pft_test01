package Exc_2_4;

public class Point {
  public double p1; // абсцисса точки
  public double p2; // ордината точки

  public Point(double p1, double p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

  public double distance(Point p2) {
    return Math.sqrt(Math.pow((p2.p1 - this.p1), 2) + Math.pow((p2.p2 - this.p2), 2));
  }

}
