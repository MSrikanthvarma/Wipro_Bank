package org.scala.PartialFunction

class SquareRoot extends App {

  val squareRoot = new PartialFunction[Double, Double] {
    def isDefinedAt(x: Double) = {
      x >= 0
    }
    def apply(x: Double) = {
      math.sqrt(x)
    }
  }
}