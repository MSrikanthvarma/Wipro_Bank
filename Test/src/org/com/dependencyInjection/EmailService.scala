package org.com.dependencyInjection

class EmailService extends MessageService {
  def sendMessage(email: String, reciever: String) = {
    "Send email " + email + " to mail id " + reciever
  }
}