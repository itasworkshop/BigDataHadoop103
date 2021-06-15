class ParentClass
{
  var x=10
  def printme(): Unit =
  {
    println("Hello From Parent Class ", x)
  }
}

class ChildClass extends ParentClass
{
  var y=20
  def printme(z:Int): Unit =      // Function Overriding
  {
    println("Hello From Child Class ", y)
    println("Hello From Child Class For Z ", z)
  }

}
object TestInheritance {

  def main(args:Array[String]): Unit =
  {
   var Obj = new ChildClass()
    Obj.printme(12)
    Obj.printme()
  }

}
