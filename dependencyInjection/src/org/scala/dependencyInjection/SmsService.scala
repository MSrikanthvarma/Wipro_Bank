package org.scala.dependencyInjection

class SmsService extends MessageService {
  def sendMessage(sms: String, reciever: String) {
    print("send" + sms + "to" + reciever)
  }
}