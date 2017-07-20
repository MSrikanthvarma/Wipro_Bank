package org.scala.dependencyInjection

trait MessageService {
  def sendMessage(message: String, reciever: String)
}
