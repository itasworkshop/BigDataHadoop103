object TestStudent {

  def main(args: Array[String]): Unit = {
    calculateGrade(68)
    var result:String= calculateGrade1(98)

    println(result)

    //var result:String=
  }

  def calculateGrade(percentage: Int): Unit = {
    if (percentage > 90 && percentage <= 100) {
      println("Grade A")
    }

    if (percentage > 80 && percentage <= 90) {
      println("Grade B")
    }

    if (percentage > 70 && percentage <= 80) {
      println("Grade C")
    }

    if (percentage < 70) {
      println("Failed")
    }
  }

  def calculateGrade1(percentage: Int): String = {
    if (percentage > 90 && percentage <= 100) {
      //println("Grade A")
      return "Grade A"
    }

    else if (percentage > 80 && percentage <= 90) {
      //println("Grade B")
      return "Grade B"
    }

    else if (percentage > 70 && percentage <= 80) {
      //println("Grade C")
      return "Grade C"
    }

    else  {
     // println("Failed")
      return "Failed"
    }
  }

}
