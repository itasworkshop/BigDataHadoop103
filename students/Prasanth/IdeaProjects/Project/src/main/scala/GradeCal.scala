import java.util.Scanner
object GradeCal {
  def main(args: Array[String]): Unit ={
    var scanner = new java.util.Scanner(System.in)
    var line:String = scanner.nextLine()
    var Marks:Int = line.toInt
    if(Marks >= 90){
      println("Your Grade is: A")
    }
    else if (Marks>=80 && Marks<90){
      println("Your Grade is: B")
    }else if(Marks>=70 && Marks<80){
      println("Your Grade is: C")
    }else if(Marks<70){
      println("Failure " + "You Mark is below 70 better luck next time")
    }
  }

}
