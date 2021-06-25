object TestLoop3 {
  def main(args: Array[String]): Unit = {
    var myList = List(1, 2, 3, 4, 5)
    var yresult = for {x <- myList if x > 3; if x < 6} yield x;
    println("yield is ", yresult)
  }
}
