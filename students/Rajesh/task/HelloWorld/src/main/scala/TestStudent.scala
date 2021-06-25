
class Student{
  var id:Int = 101;
  var name:String = "Rajesh"

  def printMe(): Unit = {
    println("hey this is "+this.name+ " my id is"+this.id)

  }
}


object TestStudent {
  def main(args: Array[String]): Unit = {
    var st1 = new Student();
    st1.printMe();

    var st2 = new Student();
    st2.printMe();

  }
}