object TestLoop2 {
  def main(args: Array[String]): Unit = {
    var mylist = List(1,2,3,4,5,6)
    mylist.foreach(x => println(x))
    println(mylist)
    //for(x <- mylist){
      //println(x)
    //}
    for(x <- mylist if x>3; if x<6){
      println(x)
    }
  }

}
