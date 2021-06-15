class ParentClass2(id:Int,name:String)
{
  override def toString(): String =
  {
    return "My Id Is "+ id+ " & Name Is "+name

  }
}

class ChildClass2(id:Int,name:String) extends ParentClass2(id,name)
{

}

object TestInheritance2 {

  def main(args:Array[String]): Unit =
  {
    var obj1 = new ParentClass2(10,"Rahul")
    var obj2 = new ChildClass2(20,"Sagar")

    println(obj1)
    println(obj2)
  }

}
