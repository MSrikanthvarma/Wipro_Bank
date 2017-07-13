package org.com.dependencyInjection

class EmailServiceInjector extends ServiceInjector {
  def getConsumer() = {
    new Consumer(new EmailService)
  }
}