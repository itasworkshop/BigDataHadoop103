object TestLoop3 {
  def main(args: Array[String]): Unit = {
    //return type of loop is stored as yield

    var mylist = List(1,2,3,4,5,6);

    var yresult = for{x <- mylist if x>3; if x<6} yield x;

      println(" yield results  is ",yresult);
    }

}
