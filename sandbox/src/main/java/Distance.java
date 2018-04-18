public class Distance {

  public Point point1; //точка 1.
  public Point point2; //точка 2.
  public Distance(Point p1, Point p2) {
    this.point1 = p1;
    this.point2 = p2;
  }
  public static void main(String[] args) {
    Point p1 = new Point(5, 7);
    Point p2 = new Point(3, 4);
    Distance D = new Distance(p1, p2);
    //System.out.println("Расстояние между точками p1 и p2 = " +  p1.distance(p1, p2) + p2.distance(p1, p2));
    System.out.println("Расстояние между точками p1 и p2 = ");
    /// return Math.sqrt(Math.pow((D.Point2.p1-D.Point1.p1),2) + Math.pow((D.Point2.p2 - D.Point1.p2),2));
   // return 1;
  }
}
