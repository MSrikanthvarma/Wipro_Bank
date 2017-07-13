package org.com.dependencyInjection

import org.junit.Test;
import org.hamcrest.MatcherAssert._
import org.hamcrest.Matchers._

class TestClass {

  @Test
  def testEmailService() {
    val injector: ServiceInjector = new EmailServiceInjector()
    val result = injector.getConsumer().processMessage("Hi how are you", "bharath.8199@gmail.com")
    assertThat("Failed", "Send email Hi how are you to mail id bharath.8199@gmail.com", is(equalTo(result)))
    println("Succesfully verified email service")
  }

  @Test
  def testSmsService() {
    val injector: ServiceInjector = new SmsServiceInjector()
    val result = injector.getConsumer().processMessage("Hi how are you", "7794994702")
    assertThat("Failed", "send sms Hi how are youto mobile 7794994702", is(equalTo(result)))
    println("Succesfully verified sms service")
  }
}