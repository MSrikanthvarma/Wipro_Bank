package org.com.caseclass

class Area {

  def area(shape: Shape) = {
    val area = shape match {
      case Rectangle(len, wid) => len * wid
      case Circle(rad)         => math.Pi * rad * rad
      case Square(side)        => side * side
      case _                   => 0
    }
    area
  }
}

trait Shape

case class Rectangle(length: Int, width: Int) extends Shape
case class Square(side: Int) extends Shape
case class Circle(radius: Int) extends Shape