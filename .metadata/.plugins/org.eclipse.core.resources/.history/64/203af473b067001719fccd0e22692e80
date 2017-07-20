package org.scala.dependencyInjection

object SendMessageApp {
  def main(args: Array[String]): Unit = {
    val injector: ServiceInjector = new EmailServiceInjector()
    injector.getConsumer().processMessage("Hi how are you", "bharath.8199@gmail.com")
  }
}