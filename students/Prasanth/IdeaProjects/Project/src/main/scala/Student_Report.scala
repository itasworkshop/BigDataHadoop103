class Student1(id:Int,name:String,cMarks:Int,pMarks:Int,mMarks:Int){

  def printThis(): Unit ={

    if(cMarks>pMarks){
      if(cMarks>mMarks){
        println(this.id +" "+ this.name +" Your Maximum Mark is: "+ this.cMarks)
      }else{
        println(this.id +" "+ this.name +" Your Maximum Mark is: "+ this.mMarks)
      }
    }else {
      if(pMarks>mMarks){
        println(this.id +" "+ this.name +" Your Maximum Mark is: "+ this.pMarks)
      }else{
        println(this.id +" "+ this.name +" Your Maximum Mark is: "+ this.mMarks)
      }
    }

  }

}
object Student_Report {
  def main(args:Array[String]): Unit ={
    var stdmark = new Student1(101,"raj",45,55,67)
    stdmark.printThis()

    var stdmark1 = new Student1(102,"rajesh",95,85,97)
    stdmark1.printThis()

    var stdmark2 = new Student1(103,"suraj",43,55,60)
    stdmark2.printThis()

    var stdmark3 = new Student1(104,"tom",71,65,70)
    stdmark3.printThis()

  }
}