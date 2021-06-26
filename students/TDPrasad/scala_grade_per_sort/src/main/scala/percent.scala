class MaxMarks(id:Int,name:String,cmarks:Int,pmarks:Int,mmarks:Int){
  def PrintMarks(): Unit = {
    var sum: Int = 0
    var avg: Int = 0
    sum = cmarks+pmarks+mmarks
    avg = sum/3
    println( avg + "%")

  }
}
object StudentMaximumMarks {
  def main(Args:Array[String]): Unit ={
    var s1 = new MaxMarks(101,"raj",45,55,67)
    s1.PrintMarks()
    var s2 = new MaxMarks(102,"rajesh",65,85,77)
    s2.PrintMarks()
    var s3 = new MaxMarks(103,"suraj",43,55,60)
    s3.PrintMarks()
    var s4 = new MaxMarks(104,"tom",71,65,70)
    s4.PrintMarks()

  }

}