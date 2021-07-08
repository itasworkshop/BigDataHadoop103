object CalculateGrade {

  def main(args: Array[String]) {
    val marks: Array[Int]= Array(70,80,80,88,90)
    var total: Float=0
    var average: Float=0

    for(i<-marks)
      {
        println(i)
      }
      for(i<-marks.indices) {
        total = total + marks(i)
      }
        println("Total MArks is :"+total)
        average=total/5
        println("Average : "+average)
        print("Student Grade is : ")
          if(average>=90)
          {
            println("A Grade")
          }
          else if(average>=80 && average<90)
          {
             println("B Grade")
          }
          else if(average>=70 && average<80)
          {
            println("C Grade")
          }
          else
            {
              println("Fail..")
            }


  }
}
