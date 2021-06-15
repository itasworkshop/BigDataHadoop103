class Myclass
{
  def printme(): Unit =
  {
    println("Hello From Anonomy Class ")
  }
}

object TestAnomiousObject {

  def main(args:Array[String]): Unit =
  {
    new Myclass().printme()
  }

}
