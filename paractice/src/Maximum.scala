

object Maximum extends App {
  def max[T](a: T, b: T)(implicit fun: Function1[T, Ordered[T]]): T = if (fun(a) < b) b else a
  println(max("a", "b"))
}