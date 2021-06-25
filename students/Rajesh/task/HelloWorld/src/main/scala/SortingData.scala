case class Man(var id: Int, var name: String)
object SortingData {

  def main(Args:Array[String]): Unit = {
    var stu1 = Man(101, "raj")
    var stu2 = Man(121, "rajesh")
    var stu3 = Man(130, "suraj")
    var stu4 = Man(114, "tom")
    val merge = List(stu1,stu2,stu3,stu4)
    // using sortBy function
    var resultid =merge.sortBy(_.id)
    var resultName =merge.sortBy(_.name)
    println("The order id value is  " + resultid)
    println("The order name value is  " + resultName)
    // SortWith function comparing  with comparator function like java
    println("The result of id compared to another id is   " + merge.sortWith(_.id < _.id))
    println("The result of name compared to another name is  " + merge.sortWith(_.name < _.name))
  }

}
