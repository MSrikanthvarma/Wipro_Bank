package org.scala.CaseClass

object Area extends App {
  val shape: Shape = Rectangle(3, 4)
  val area = shape match {
    case Rectangle(len, wid) => len * wid
    case Circle(rad)         => math.Pi * rad * rad
    case Square(side)        => side * side
    case _                   => print("Specified shape is not present")
  }
  println(area)
}

trait Shape

case class Rectangle(length: Int, width: Int) extends Shape
case class Square(side: Int) extends Shape
case class Circle(radius: Int) extends Shape
