package org.com.caseclass

import org.junit.Test;
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matchers._

class TestClass {

  @Test
  def testRectangle() {
    val area = new Area
    var result: Any = area.area(Rectangle(3, 4))
    assertThat("Failed", 12, is(equalTo(result)))
    println("Succesfully verified area of rectangle")
  }

  @Test
  def testSquare() {
    val area = new Area
    var result: Any = area.area(Square(3))
    assertThat("Failed", 9, is(equalTo(result)))
    println("Succesfully verified area of square")
  }

  @Test
  def testCircle() {
    val area = new Area
    var result: Any = area.area(Circle(3))
    assertThat("Failed", 28.274333882308138, is(equalTo(result)))
    println("Succesfully verified area of circle")
  }
}