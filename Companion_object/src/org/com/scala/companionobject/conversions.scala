package org.com.scala.companionobject

object conversions extends App {
  val a: Euro = Rupee(65)
  println(a.value)
}