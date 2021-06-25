object TestLoop1 {
  def main(args: Array[String]): Unit = {
    //var x:Int = 10
    var x = 10
    for(x<- 11 to 15){
      println(x)
    }
    for(x<- 11 until 15) {
      println("x val is "+x)
    }
    for(x<- 11 until 15; y<- 15 until 20) {
      println("x val is "+x+ " y vai is "+y)
    }
    for(x<- 11 until 15 by 2) {
      println("x val is "+x)
    }
    var z = 0;
    while (z<5){
      z = z+1
      println(z)
    }
    do {
      println(z)
    }while (x<5)

  }

}
