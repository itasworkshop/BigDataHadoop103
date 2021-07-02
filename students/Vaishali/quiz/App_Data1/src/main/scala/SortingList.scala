object SortingList {

  def Data(x:Int, y:String):Unit={
    var id:Int =x
    var name:String =y

  }
  def main(args: Array[String]) : Unit = {

    val FEmp: Unit= Data(101,"Raj")
    val SEmp: Unit= Data(121,"Rajesh")
    val TEmp: Unit= Data(130,"Suresh")
    val FoEmp: Unit= Data(114,"Tom")
    val emp =List(FEmp,SEmp,TEmp,FoEmp);
    val sortedlist=emp.sorted
    println(sortedlist);

  }




  }
