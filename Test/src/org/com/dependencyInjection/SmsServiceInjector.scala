package org.com.dependencyInjection

class SmsServiceInjector extends ServiceInjector {
  def getConsumer() = {
    new Consumer(new SmsService)
  }
}