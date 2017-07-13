package org.com.implicits

import org.junit.Test;
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matchers._

class TestClass {

  @Test
  def testMaxInt() {
    val maximum = Maximum.max(10, 20)
    assertThat("Failed", 20, is(equalTo(maximum)))
    println("Succesfully verified maximum of two ints")
  }

  @Test
  def testMaxString() {
    val maximum = Maximum.max("a", "b")
    assertThat("Failed", "b", is(equalTo(maximum)))
    println("Succesfully verified maximum of two strings")
  }
}