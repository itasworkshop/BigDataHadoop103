object st_grade extends App {
  println("Enter the student marks: ");
  val marks:Int = scala.io.StdIn.readInt();
  if (marks >= 90 && marks <= 100)
  {
    println("The student got Grade A")
  }
  else if (marks >= 80 && marks < 90)
  {
    println("The student got Grade B")
  }
  else if (marks >= 70 && marks < 80)
  {
    println("The student got Grade C")
  }
  else
  {
    println("The student is Failed")
  }
}
