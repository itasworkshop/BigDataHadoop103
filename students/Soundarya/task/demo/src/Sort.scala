class Stu(id:Int,name:String){
  def printMe(): Unit ={
    println("Hey this is "+this.name+ " my id is " +this.id )

    val  ids=List(st1,st2,st3,st4)
    //scala.util.Sorting.quickSort(ids)(ordering[Stu])
    //ids.foreach{println}

    println (ids.sortBy(ids=>(ids.name,ids.id)(Ordering[Int].reverse)))

    }
object TestSub {
  def main(args:Array[String]){
    var st1=new Stu(id=101,name="raja");
    var st2=new Stu(id=121,name="rajsh");
    var st3=new Stu(id=130,name="suraj");
    var st4=new Stu(id=114,name="tom")
    st1.printMe();
    st2.printMe();
    st3.printMe();
    st4.printMe();
    }
  }
}

