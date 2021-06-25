class MaximumMarks(id:Int,name:String,calmarks:Int,permarks:Int,maxmarks:Int){
  def PrintStuMarks(): Unit = {
    var sum: Int = 0
    var average: Int = 0
    sum = calmarks+permarks+maxmarks
    average = sum/3
    println("My ID is  "+ this.id+" My name is " +this.name+" The maximum % scored mark is "+ average + "%")
  }
}

object MaximumMarks {
  def main(Args:Array[String]): Unit ={
    var studmark = new MaximumMarks(101,"raj",45,55,67)
    studmark.PrintStuMarks()
    var studmark1 = new MaximumMarks(102,"rajesh",65,85,77)
    studmark1.PrintStuMarks()
    var studmark2 = new MaximumMarks(103,"suraj",43,55,60)
    studmark2.PrintStuMarks()
    var studmark3 = new MaximumMarks(104,"tom",71,65,70)
    studmark3.PrintStuMarks()

  }


}
