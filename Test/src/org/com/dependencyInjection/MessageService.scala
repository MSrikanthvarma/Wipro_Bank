package org.com.dependencyInjection

trait MessageService {
  def sendMessage(message: String, reciever: String): String
}
