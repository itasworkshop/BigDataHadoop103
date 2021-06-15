object TestLoop2 {

  def main(args:Array[String]): Unit =
  {

    var x:Int=0
    var mylist=List(1,2,3,4,5,6,7)


    for(x<-mylist)
      {
        println("List Items = ",x)
      }

    for(x<-mylist
        if(x>3); if(x<6))               // Conditional For loop Or Controlling Loop
    {

      println("List Items Conditional Loop = ",x)
    }
    var yieldresult = for{x<-mylist if(x>3) ; if(x<6)}  yield x // Return Type Of Lo0p Is Stored In Yield Variable

       println("Yield Return Result ",yieldresult)



    var yieldresult1 = for{x<-mylist if(x>3) ; if(x<5)}  yield x // Return Type Of Lo0p Is Stored In Yield Variable

    println("Yield Return Result 1 ",yieldresult1)

  }



}
