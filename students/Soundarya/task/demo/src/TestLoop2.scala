object TestLoop2 {
  def main(args:Array[String]):Unit={
    var myList=List(1,2,3,4,5)
myList.foreach(x=>println(x))
    for(x<-myList){
      println(x)
    }
    for(x<-myList if x>3;if x<6){
      println(x)
    }
  }

}
