object TestLoop {

  def main(args:Array[String])
  {
    var x:Int=0

    for(x<-1 to 5)      // Range Of Value
      {
        println(" For loop = "+ x)
      }
    var y=0

    for(x<-1 to 3 ; y<-1 until 5)      // Range Of Value
    {
      println(" For loop Multirange for x = "+ x)
      println(" For loop Multirange for y = "+ y)
    }



    for(y<-1 until  5)      // Range Of Value Using Until Way
    {
      println(" For loop For Y = "+ y)
    }

    for(y<-1 until 10 by 2)      // Range Of Value Using Until Way With By Method(Incremental Way Here Its 2)
    {
      println(" For loop For Y 2nd = "+ y)
    }
    while (x<=5)      // Execute Before Condition
      {
        println(" While loop = "+ x)
        x= x+1
      }

    do        // Do Atleast Once Condition
      {
       println("Do While Loop = "+ x)
       x=x+1
      }while(x<=10)



  }


}
/*
Scala Command Line Example

scala> var x:Int = 5
var x: Int = 5

scala> var y=10
var y: Int = 10


 */