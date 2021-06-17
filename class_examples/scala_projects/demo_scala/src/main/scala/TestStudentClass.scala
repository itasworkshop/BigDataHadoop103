class Student1(id:Int,name:String){
  var collegeName:String = "IIITB"

  def printMe(): Unit ={
    println("Hey this is "+ this.name + " my id is "+ this.id +" studying in "+ collegeName)
  }
}

object TestStudentClass {
  def main(args:Array[String]){
    var st1 = new Student1(101,"Rajesh");
    st1.printMe();

    var st2 = new Student1(102,name = "Suraj");
    st2.printMe();
  }
}
