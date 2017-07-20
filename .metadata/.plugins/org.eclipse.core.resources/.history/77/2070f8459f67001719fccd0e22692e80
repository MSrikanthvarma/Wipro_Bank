case class Dollar(value: Double)
case class Euro(value: Double)
case class Rupee(value: Double)

object Dollar {
  implicit def dollarToRupee(dollar: Dollar): Rupee = {
    Rupee(dollar.value * 65)
  }
  implicit def dollarToEuro(dollar: Dollar): Euro = {
    Euro(0.88 * dollar.value)
  }
}

object Euro {
  implicit def EuroToDollar(euro: Euro): Dollar = {
    Dollar(1.14 * euro.value)
  }
  implicit def EuroToRupee(euro: Euro): Rupee = {
    EuroToDollar(euro)
  }
}

object Rupee {
  implicit def RupeeToDollar(rupee: Rupee): Dollar = {
    Dollar(rupee.value / 65)
  }
  implicit def RupeeToEuro(rupee: Rupee): Euro = {
    RupeeToDollar(rupee)
  }
}