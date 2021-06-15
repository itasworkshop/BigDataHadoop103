object TestNothing {

  def main(args:Array[String]): Unit =
  {
    def printme(): Nothing =
    {
      println("Hello from Nothing return type")
     // return "Return Type Nothing Example"     ---  Nothing data type never returns anything
  //return None
    }
    printme()
  }

}
