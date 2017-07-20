package org.scala.dependencyInjection

class EmailService extends MessageService {
  def sendMessage(email: String, reciever: String) {
    print("Send " + email + " to " + reciever)
  }
}