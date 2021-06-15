class Student1(id:Int,name:String)           // Its A Primary Constructor Which Is Used For Intialization Purpose
{
  var collegename:String="IIT"

  def printMe(): Unit =
  {
    println("Hello This Is ",name," With ID",id,"From University",collegename)
  }
}


object TestStudentClass1 {

  def main(args:Array[String]): Unit =
  {
    var student1=new Student1(12,"Rahul")
    student1.printMe()

    var student2=new Student1(20,"Raj")
    student2.printMe()

  }
}
