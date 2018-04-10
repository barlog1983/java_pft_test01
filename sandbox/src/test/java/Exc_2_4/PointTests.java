package Exc_2_4;

import Exc_2_4.Distance;
import Exc_2_4.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point p1 = new Point(4, 0);
    Point p2 = new Point(9, 0);
    Assert.assertEquals(p1.distance(p2), 5.0);
  }


}
