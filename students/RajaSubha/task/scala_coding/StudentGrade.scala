object StudentGrade {

  def main(args:Array[String]): Unit ={
    CalculateGrade(60)

  }

  def CalculateGrade(percentage:Int): Unit ={
    if(percentage >90 && percentage <=100){
      println("Grade A")
    }else if(percentage > 80 && percentage <= 90){
      println("Grade B")
    }else if(percentage > 70 && percentage <=80){
      println("Grade C")
    }else{
      println("Failure")
    }
  }

}
