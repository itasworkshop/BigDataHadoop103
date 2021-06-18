object TestLoop1 {
  def main(args:Array[String]): Unit = {
    //var x:Int =10;
    //var  x= 10;

    for (x <- 11 to 15) {
      //println(x);
    }

    for (x <- 11 until 15) {
      //println(x);
    }

    for (x <- 11 to 13; y <- 5 to 8) {
      println("x is ", x);
      println("y is ", y);
    }

    for (x <- 11 until 15 by 2) {
      println(x);
    }

    var x = 0
    while(x < 5){
      println(x)
      x = x +1
    }

    do{
      println(x)
    }while(x<5)
  }
}
