package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {
@Test
  public void testDistance(){
  Point p= new Point(15,15,130,56);
  Assert.assertEquals(p.distance(),122);
}
}
