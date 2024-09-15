class maximum_marks(id:Int, name:String, cmarks:Int, pmarks:Int, mmarks:Int){

  def print_marks(): Unit = {

    var sum: Int = 0
    var average: Int = 0
    sum = cmarks+pmarks+mmarks
    average = sum / 3
    println("My ID is: "+ this.id+" My name is: " +this.name+" The maximum % scored mark is: "+ average + "%")
  }
}
object student_report {

  def main(Args:Array[String]): Unit = {
    var studentmark = new maximum_marks(101,"raj",45,55,67)
    studentmark.print_marks()

    var studentmark1 = new maximum_marks(102,"rajesh",65,85,77)
    studentmark1.print_marks()

    var studentmark2 = new maximum_marks(103,"suraj",43,55,60)
    studentmark2.print_marks()

    var studentmark3 = new maximum_marks(104,"tom",71,65,70)
    studentmark3.print_marks()
  }


}




