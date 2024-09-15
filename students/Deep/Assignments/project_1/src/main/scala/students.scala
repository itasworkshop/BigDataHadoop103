class students {
  var id, cmarks, pmarks, mmarks, tot, per: Int = 0;
  var name: String = "";
  def SetVal(i:Int, nm:String, cm:Int, pm:Int, mm:Int): Unit = {
    this.id = i;
    this.name = nm;
    this.cmarks = cm;
    this.pmarks = pm;
    this.mmarks = mm;
    this.tot = cm + pm + mm;
    per = this.tot /3;
  }
  def Show(): Unit = {
    println("Student ID ",this.id," Name ",this.name);
    println("Chemistry marks ",this.cmarks);
    println("Physics marks ",this.pmarks);
    println("Math marks ",this.mmarks);
    println("Total marks ",this.tot);
    println("Percentage of marks ",this.per);
  }
}
object SortPercent
{
  def main(arg: Array[String]){
    var i,j : Int = 0;
    var stud = Array.fill[Students](4)(new Students());
    stud(0).SetVal(101,"raj",45,55,67);
    stud(1).SetVal(102,"rajesh",65,85,77);
    stud(2).SetVal(103,"suraj",43,55,60);
    stud(3).SetVal(104,"tom",71,65,70);

    var tmp = new Students();

    for(i <- 0 to 3)
    {
      for (j<- i to 3)
      {
        if (stud(i).tot < stud(j).tot)
        {
          tmp = stud(i);
          stud(i) = stud(j);
          stud(j) = tmp;
        }
      }
    }
    for( i <- 0 to 3)
    {
      stud(i).Show();
      println("");
    }
  }
}
