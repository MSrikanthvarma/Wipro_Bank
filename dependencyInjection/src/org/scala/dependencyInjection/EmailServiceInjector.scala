package org.scala.dependencyInjection

class EmailServiceInjector extends ServiceInjector {
  def getConsumer() = {
    new Consumer(new EmailService)
  }
}