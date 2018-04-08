package Exc_2_1;

public class Point {
  public double p1; // x1
  public double p2; // y1
  public double p3; // x2
  public double p4; // y2


  public Point(double p1, double p2, double p3, double p4) {
    this.p1 = p1;
    this.p2 = p2;
    this.p3 = p3;
    this.p4 = p4;
  }

  public double distance() {
    return Math.sqrt(Math.pow((this.p3 - this.p1), 2) + Math.pow((this.p4 - this.p2), 2));

  }
}