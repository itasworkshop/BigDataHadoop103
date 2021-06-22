case class Person(var id: Int, var name: String)

object Sorting {

      def main(Args:Array[String]): Unit = {

        var studentone = Person(101, "raj")
        var studenttwo = Person(121, "rajesh")
        var studentthree = Person(130, "suraj")
        var studentfour = Person(114, "tom")

        val merge = List(studentone,studenttwo,studentthree,studentfour)
           //sortBy function ,sorted using given attribute
        var resultid =merge.sortBy(_.id)
        var resultName =merge.sortBy(_.name)

        println("the orderwise id value is  " + resultid)
        println("the orderwise name value is  " + resultName)


        // SortWith function comparing  with comparator function like java
        println("The result of id compared to another id is   " + merge.sortWith(_.id < _.id))
        println("The result of name compared to another name is  " + merge.sortWith(_.name < _.name))
      }



}
