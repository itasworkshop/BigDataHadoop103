object TestFunction {
  def main(args:Array[String]): Unit = {
    addition1(5,6)
    var result:Int = addition2(7,8)
    println(result)
  }

  def addition1(x:Int,y:Int): Unit ={
    println(x+y)
  }

  def addition2(x:Int,y:Int): Int ={
   return x+y
  }

}
