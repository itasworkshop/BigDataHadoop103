class Sort(x:Int,y:String) {
  var id:Int = x
  var name:String = y
  this.id = 0
  this.name =""

  def printThis(): Unit ={
    println("Sorting Based on ID: ")
    println(this.id+" "+this.name)
  }
}

object Sorting {
  def main(args: Array[String]): Unit = {
    var std = new Sort(101,"Alex")
    var std1 = new Sort(102,"Prasanth")
    var std2 = new Sort(103,"Alesa")
    var std3 = new Sort(104,"Pravish")
    var result = List(std,std1,std2,std3)
    result.sortBy(result=>(result.id,result.name))
  }
}
