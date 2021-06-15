object TestString {

  def main(args:Array[String]): Unit =
  {
    var x:String=""
    var y:String= "Hello"
    var z="World"

    println("Value Of X", x)
    println("Value Of Y", y)
    println("Value Of Z", z)

   // y=50
    //z=60
   // println("New Value Of Y", y)
    //println("New Value Of Z", z)

   // z=60: Int         Cannot
    // println("New Value Of Y", y)
    //println("Newest Value Of Z", z)

    var t:String=
      """ Hi Hello World
        |This Is MultiLine String
        |""".stripMargin

    println(t)
  }

}
