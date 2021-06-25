case class Person(var id: Int, var name: String)

  object Sort {
    def main(Args:Array[String]): Unit = {
      var s1 = Person(101, "raj")
      var s2 = Person(121, "rajesh")
      var s3 = Person(130, "suraj")
      var s4 = Person(114, "tom")
      val merge = List(s1, s2, s3, s4)
      //sortBy function ,sorted using given attribute
      var sort_id =merge.sortBy(_.id)
      var sort_name =merge.sortBy(_.name)
      println("the orderwise id value is  " + sort_id)
      println("the orderwise name value is  " + sort_name)

    }
}
