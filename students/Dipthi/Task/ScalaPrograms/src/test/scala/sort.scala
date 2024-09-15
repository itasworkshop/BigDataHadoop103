object sort {
  def main(args:Array[String]){
    var emp1=new Data(id=101,name="raja");
    var emp2=new Data(id=121,name="rajesh");
    var emp3=new Data(id=130,name="raja");
    var emp4=new Data(id=114,name="Tom");
    emp1.printMe();
    emp2.printMe();
    emp3.printMe();
    emp4.printMe();

  }
}

class Data(id:Int,name:String) {
  def printMe(): Unit = {
    println("Hey this is " + this.name + " my id is " + this.id)

    val ids = List(emp1, emp2, emp3, emp4)
    println(ids.sortBy(ids => (ids.name, ids.id) (Ordering[Int].reverse))
  }
}
