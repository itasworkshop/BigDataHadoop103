class ParentClass1
{
  def printme(): Unit =
  {
    println("Hello From Parent Class ")
  }
}

class ChildClass1 extends ParentClass1
{
  override def printme(): Unit =
  {
    println("Hello From Child Class ")
  }
}

class GrandChild extends ChildClass1
{
  override def printme(): Unit =
  {
    println("Hello From Grand Child Class ")
  }
}

object TestInheritance1 {

  def main(args:Array[String]): Unit =
  {
   // var Obj = new ChildClass1()
   // Obj.printme()

    /*var obj1 = new ParentClass1()
    var obj2 = new ChildClass1()
    var obj3 = new GrandChild()*/

    var obj1:ParentClass1 = new ParentClass1()
    var obj2:ParentClass1 = new ChildClass1()
    var obj3:ParentClass1 = new GrandChild()

    obj1.printme()
    obj2.printme()
    obj3.printme()

  }

}
