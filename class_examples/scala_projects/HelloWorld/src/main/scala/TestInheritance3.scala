class OverloadingClass
{
  def printme(): Unit =
  {
    println("Hello From Parameterless Class ")
  }

  def printme(id:Int): Unit =
  {
    println("Hello From Parameter Class ", id)
  }

  def printme(name:String): Unit =
  {
    println("Hello From Parameter Class For String", name)
  }

  def printme(x:Int,y:String): Unit =
  {
    println("Hello From Parameter Class For 2 Parameters ",x +y)
  }

  def printme(y:String,x:Int): Unit =
  {
    println("Hello From Parameter Class For 2 reverse Parameters ",x +y)
  }
}


object TestInheritance3 {

  def main(args:Array[String]): Unit =
  {
  var obj = new OverloadingClass()
    obj.printme()
    obj.printme(20)
    obj.printme("Ramu")
    obj.printme(25,"rahul")

  }

}
