object StudentGrade {

  def main(args:Array[String]): Unit ={
    var total:Float = 0
    var percent:Float = 0
    var marks:Int = 0
    println("Enter stu marks: ")
    for(count <- 1 to 6){
      var marks = scala.io.StdIn.readInt()
      total = total + marks
    }
    println("Total marks : " +total)
    percent = total/6
    println("Percentage is: " +percent)
    if (percent>=90 && percent<=100){
      println("Grade:A")
    }else if(percent>=80 && percent<=90) {
      println("Grade:B")
    }else if(percent>=70 && percent<=80) {
      println("Grade:C")
    } else{
      println("Fail")
    }

  }

}