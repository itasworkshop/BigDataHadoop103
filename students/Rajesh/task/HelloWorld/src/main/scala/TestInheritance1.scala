class Person{
  var id:Int = 101;
  var Name:String = "Rajesh"

  def printMe(): Unit ={
    println("Hey this is "+this.Name+ " my id is "+this.id)
  }
}
class Student2 extends Person{
  var marks:Int = 76
  override def printMe(): Unit ={
    println("Hey this is "+this.Name+ " my id is "+this.id+ " my marks are "+this.marks)
  }

}
class Employee extends Person {
  var salary: Int = 76000
  override def printMe(): Unit ={
    println("Hey this is "+this.Name+ " my id is "+this.id+ " my salary is "+this.salary)
  }

}
object TestInheritance1 {
  def main(args: Array[String]): Unit = {
    var s1 = new Student2()
    s1.printMe()
    var e1 = new Employee()
    e1.printMe()

  }

}
