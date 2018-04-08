package Exc_2_4;

public class Point {
  public double p1; // абсцисса точки
  public double p2; // ордината точки

  public Point(double p1, double p2) {
    this.p1 = p1;
    this.p2 = p2;
  }

 // public double distance(Point p1, Point p2) {
//    return Math.sqrt(Math.pow((p2.p1 - p1.p1), 2) + Math.pow((p2.p2 - p1.p2), 2));
//  }
//AB = √(xb - xa)2 + (yb - ya)2
//  public double distance() {
//    return Math.sqrt(Math.pow((this.p1 - this.p1), 2) + Math.pow((this.p2 - this.p2), 2));
//  }


  public  double distance(Point P){
    double x = this.p2 - this.p1;
    double y =  P.p2 - P.p1;
    return Math.sqrt(x * x + y * y);

  }

}
