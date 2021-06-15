class Student
{
  var id:Int=101
  var name:String="Rahul"

  def printMe(): Unit =
  {
    println("Hello This Is ",name," With ID",id)
  }
}

object TestStudentClass {

  def main(args:Array[String]): Unit =
  {
    var student1=new Student()
    student1.printMe()

    var student2=new Student()
    student2.printMe()

  }

}
