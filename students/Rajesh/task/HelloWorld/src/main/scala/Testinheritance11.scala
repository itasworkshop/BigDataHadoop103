class Person1(id:Int,Name:String){
  var common_att:String = "human"

  def printMe(): Unit ={
    println("Hey this is "+this.Name+ " my id is "+this.id)
  }
}
class Student3(id:Int,Name:String,marks:Int) extends Person1(id,Name){
  var college:String ="spirits"
  override def printMe(): Unit ={
    println("Hey this is "+this.Name+ " my id is "+this.id+ " my marks are "+this.marks)
  }

}
class Employee1 (id:Int,Name:String,salary:Int) extends Person1(id,Name){
  var company: String = "mango"
  override def printMe(): Unit ={
    println("Hey this is "+this.Name+ " my id is "+this.id+ " my salary is "+this.salary)
  }

}
object Testinheritance11 {
  def main(args: Array[String]): Unit = {
    var s1 = new Student3(id = 101,Name = "Rajesh",marks = 75)
    s1.printMe()
    var e1 = new Employee1(id = 404,Name = "Raj",salary = 45000)
    e1.printMe()

  }

}
