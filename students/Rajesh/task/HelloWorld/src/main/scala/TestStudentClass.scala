class Student1(id:Int , Name:String){
  var collegeName:String = "IIT";


  def printMe(): Unit = {
    println("hey this is "+this.Name+ " my id is "+this.id+" studying in "+this.collegeName)

  }
}



object TestStudentClass {
  def main(args: Array[String]): Unit = {
    var st1 = new Student1(id = 101, Name = "Rajesh");
    st1.printMe();

    var st2 = new Student1(id = 102, Name = "Raj");
    st2.printMe();
  }
}

