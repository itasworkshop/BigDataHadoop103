/*
trait RBI{
  def calculateEMI(money:Int )
}

class HDFCBank extends RBI {
  override def calculateEMI(money:Int): Unit = {
    println("HDFC offers 8 % loan EMI.",money)
  }
}

/*class BogusBank extends RBI {
  override def calculateEMI(grain:String): Unit = {
    println("HDFC offers 8 % loan EMI.",grain)
  }
}*/

class ICICBank extends RBI {
  override def calculateEMI(money:Int): Unit = {
    println("ICIC offers 10 % loan EMI.",money)
  }
}

object TestTraits {
  def main(args:Array[String]): Unit ={
    val hdfc = new HDFCBank();
    hdfc.calculateEMI(500);

    val icic = new ICICBank();
    icic.calculateEMI(600);

  }

}
*/
