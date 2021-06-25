object TestLoop1 {
def main(args:Array[String]):Unit={
  var x=10;
  //var y=5
  for(x <- 11 to 13;y <- 5 to 7){
    println("x is",x);
    println("y is ",y);
  }
  for(x <-11 until 15 by 2){
    println(x);
    var z=0
    while(z<5){
      println(z)
      z=z+1
    }
    do{
      print(z)
    }while(z<5)

  }
}
}
