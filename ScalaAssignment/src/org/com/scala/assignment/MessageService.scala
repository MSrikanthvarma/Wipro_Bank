package org.com.scala.assignment

trait MessageService {
  def sendMessage(message: String, reciever: String)
}

class EmailService extends MessageService {
  def sendMessage(email: String, reciever: String) {
    1
    print("Send " + email + " to " + reciever)
  }
}

class SmsService extends MessageService {
  def sendMessage(sms: String, reciever: String) {
    print("send" + sms + "to" + reciever)
  }
}

trait Consumer {
  def processMessage(message: String, reciever: String)
}

class Application(messageService: MessageService) extends Consumer {
  def processMessage(message: String, reciever: String) {
    messageService.sendMessage(message, reciever)
  }
}

trait ServiceInjector {
  def getConsumer(): Consumer
}

class EmailServiceInjector extends ServiceInjector {
  def getConsumer() = {
    new Application(new EmailService)
  }
}

class SmsServiceInjector extends ServiceInjector {
  def getConsumer() = {
    new Application(new SmsService)
  }
}