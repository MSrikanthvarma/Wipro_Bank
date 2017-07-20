package org.scala.dependencyInjection

class Consumer(messageService: MessageService) {
  def processMessage(message: String, reciever: String) {
    messageService.sendMessage(message, reciever)
  }
}