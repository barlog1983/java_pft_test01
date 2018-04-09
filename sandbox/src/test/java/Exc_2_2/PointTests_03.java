package Exc_2_2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests_03 {

  @Test
  public void testDistance() {
    Point p1 = new Point(4, 0);
    Point p2 = new Point(9, 0);
    Distance_02 D = new Distance_02();
    Assert.assertEquals(D.distance(p1, p2), 8.0);
  }


}
