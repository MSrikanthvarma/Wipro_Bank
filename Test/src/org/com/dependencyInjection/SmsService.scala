package org.com.dependencyInjection

class SmsService extends MessageService {
  def sendMessage(sms: String, reciever: String) = {
    "send sms " + sms + "to mobile " + reciever
  }
}