object GradeCalucaltion1 {
  def main(args: Array[String])
  {
    val marks: Array[Int] = Array(80,80,60,50,60)
    var total:Float=0
    var avg:Float=0

    for(i <- marks )
    {
      println(i)
    }
    for(i <-marks.indices) {
      total = total + marks(i)
    }
    println("Total marks secured is:" + total)
    avg = total/5
    println ("Average:" + avg)
    println("The student Grade is: ")
    if(avg>=90)
      println("A")
    else if(avg>=80 && avg<90)
    {
      println("B")
    }
    else if(avg>=70 && avg<80)
    {
      println("C")
    }
    else
    {
      println("Fail")
    }
  }
}
