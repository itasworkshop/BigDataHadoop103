class Person1(id:Int,name:String){
  var common_att:String = "human"

  def printMe(): Unit ={
    println("Hey this is "+ this.name + " my id is "+ this.id)
  }
}

class Student3(id:Int,name:String,marks:Int) extends Person1(id,name){
  var college:String = "IITB"

  override  def printMe(): Unit ={
    println("Hey this is "+ this.name + " my id is "+ this.id +" my marks are "+this.marks)
  }
}

class Employee1(id:Int,name:String,salary:Int) extends Person1(id,name){
  var company:String = "Infy"

  override  def printMe(): Unit ={
    println("Hey this is "+ this.name + " my id is "+ this.id +" my salary is "+this.salary)
  }
}

object TestInheritance2 {
  def main(args:Array[String]): Unit = {
    var s1 = new Student3(101,"Raju",78)
    s1.printMe()

    var e1 = new Employee1(404,"Suresh",75000)
    e1.printMe()
  }
}
