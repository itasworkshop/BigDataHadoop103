object TestFunction {

  def main(args:Array[String])
  {
    val x:Int = 10
    var y:Int = 10
    println("Summation Is " +addition(10,15))

    println("Val Vs Val = " +(x+1 ) +" Y Value =" +(y+1))
   // x=x+1   -------------    compilation error because its val data type which is immutable
    y=y+1
    println("Val Vs Val = " +(x ) +" Y Value =" +(y))
  }

  def addition(x:Int,y:Int): Int =
  {
    var result:Int=0
    result = x+y
    return result


  }
}
// Var Is Normal Mutable -> Can Reassign
// Val Is Immutable -> Cannot Change or Reassign (Ex Final Keyword Type)