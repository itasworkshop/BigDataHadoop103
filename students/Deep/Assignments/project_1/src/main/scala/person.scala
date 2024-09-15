class person {
  var id: Int = 0;
  var name: String = "";
  def SetVal(i:Int, nm:String): Unit = {
    this.id = i;
    this.name = nm;
  }
  def Show(): Unit = {
    println("Persons ID ",this.id," Name ",this.name);
  }
}
object SortObject
{

  def main(arg: Array[String]){
    var i,j : Int = 0;
    var pers = Array.fill[Person](4)(new Person());
    pers(0).SetVal(101,"raj");
    pers(1).SetVal(121,"rajesh");
    pers(2).SetVal(130,"suraj");
    pers(3).SetVal(114,"tom");

    var tmp = new Person();

    for(i <- 0 to 3)
    {
      for (j<- i to 3)
      {
        if (pers(i).id > pers(j).id)
        {
          tmp = pers(i);
          pers(i) = pers(j);
          pers(j) = tmp;
        }
      }
    }
    for( i <- 0 to 3)
    {
      pers(i).Show();
      println("");
    }
  }
}
