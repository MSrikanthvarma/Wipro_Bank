package org.com.companion

import org.junit.Test;
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matchers._

class TestClass {

  @Test
  def testConversionDollarToRupee() {
    val rupee: Rupee = Dollar(1)
    val result: Any = rupee.value
    assertThat("Failed", 65.0, is(equalTo(result)))
    println("Succesfully verified conversion from dollar to rupee implicitly using companion obj")
  }

  @Test
  def testConversionDollarToEuro() {
    val euro: Euro = Dollar(1)
    val result: Any = euro.value
    assertThat("Failed", 0.88, is(equalTo(result)))
    println("Succesfully verified conversion from dollar to euro implicitly using companion obj")
  }

  @Test
  def testConversionEuroToDollar() {
    val dollar: Dollar = Euro(1)
    val result: Any = dollar.value
    assertThat("Failed", 1.14, is(equalTo(result)))
    println("Succesfully verified conversion from euro to dollar implicitly using companion obj")
  }
  @Test
  def testConversionEuroToRupee() {
    val rupee: Rupee = Euro(1)
    val result: Any = rupee.value
    assertThat("Failed", 74.1, is(equalTo(result)))
    println("Succesfully verified conversion from euro to rupee simplicitly using companion obj")
  }
}