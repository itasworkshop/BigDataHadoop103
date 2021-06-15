object TestNull {

  def main(args:Array[String]): Unit =
  {
    def printme(name:String,lience:Null): Unit =
    {
      println("Name is = "+name)
      println("Lience No Is "+lience)
    }
    //printme("rahul","")
    printme("Rahul",null)
    //printme("Rahul",127645)
  }

}
