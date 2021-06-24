trait RBI{
  def calculateEMI()
}

class HDFCBank extends RBI {
  override def calculateEMI(): Unit = {
    println("HDFC offers 8 % loan EMI.")
  }
}

class ICICBank extends RBI {
  override def calculateEMI(): Unit = {
    println("ICIC offers 10 % loan EMI.")
  }
}

object TestTraits {
  def main(args:Array[String]): Unit ={
    val hdfc = new HDFCBank();
    hdfc.calculateEMI();

    val icic = new ICICBank();
    icic.calculateEMI();

  }

}
