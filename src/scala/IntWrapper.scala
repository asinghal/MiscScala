package net.scala.misc

object IntWrapper {

  implicit def ++(i:Int) = i + 1
  
  implicit def IntIncrementWrapper(i: Int) = {
    new {
      def ++ = i + 1
      def times[A](f: => A) {
        (1 to i) foreach { x => f }
      }
    }
  }
  
}
