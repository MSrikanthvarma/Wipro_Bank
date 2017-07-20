package org.com.example

import org.junit.Test;
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matchers._

class TestClass {

  @Test
  def test() {
    val ob = new SquareRoot
    var result = ob.squareRoot(4)
    assertThat("Failed", 2.0, is(equalTo(result)))
    println("Succesfully verified square root")
  }

  @Test
  def testFailure() {
    val ob = new SquareRoot
    var result = ob.squareRoot(-10)
    assertThat("Failed", !ob.squareRoot.isDefinedAt(-10))
    println("Succesfully verified square root is not defined for negative values")
  }

  @Test
  def testNan() {
    val ob = new SquareRoot
    var result = java.lang.Double.isNaN(ob.squareRoot(-10))
    assertThat("Failed", result)
    println("Succesfully verified square root will yield NaN for negative values")
  }
}