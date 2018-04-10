package Exc_2_4;

import Exc_2_4.Distance;
import Exc_2_4.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests_02 {

  @Test
  public void testDistance() {
    Exc_2_4.Point p1 = new Exc_2_4.Point(4, 0);
    Exc_2_4.Point p2 = new Point(9, 0);
    Assert.assertEquals(p1.distance(p2), 5);
  }


}
