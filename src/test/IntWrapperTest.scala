object IntWrapperTest {
  import net.scala.misc.IntWrapper._
  def main(args: Array[String]) {
    testIncrement
    testIncrement2
    testTimes
  }
  
  def testIncrement {
    var i = 1
    i = i++
    
    if (i == 2) println ("works") else println("expected 2 but was " + i)
  }
  
  def testIncrement2 {
    var i = 1
    i = ++(i)
    if (i == 2) println ("works") else println("expected 2 but was " + i)
  }
  
  def testTimes {
    var i = 1
    def inc = { i++ }
    10 times { i = inc }
    if (i == 11) 5 times println ("it works") else println("expected 11 but was " + i)
  }
}