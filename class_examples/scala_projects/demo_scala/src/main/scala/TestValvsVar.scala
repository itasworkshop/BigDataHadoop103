object TestValvsVar {
  def main(args:Array[String]): Unit = {
    var x:Int = 10;
    val y:Int = 20;

    x = 30;
    //y = 40; no reasssignment

    println("x is "+x +" y is "+y)
  }

}
