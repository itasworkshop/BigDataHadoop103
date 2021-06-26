object MaxMark {
  def main(Args: Array[String]): Unit = {
    var studentmark = new totalmarks(101, "raj", 45, 55, 67)
    studentmark.printmarks()

    var studentmark1 = new totalmarks(102, "rajesh", 65, 85, 77)
    studentmark1.printmarks()

    var studentmark2 = new totalmarks(103, "suraj", 43, 55, 60)
    studentmark2.printmarks()

    var studentmark3 = new totalmarks(104, "tom", 71, 65, 70)
    studentmark3.printmarks()
  }
}
class totalmarks(id: Int, name: String, cmarks: Int, pmarks: Int, mmarks: Int) {
  def printmarks(): Unit = {

    if (cmarks > pmarks)
    {
      if (cmarks > mmarks)
        println("Id: " + this.id + " Name: " + this.name + " Maximum Scored Mark: " + cmarks)
      else
        println("Id: " + this.id + " Name: " + this.name + " Maximum Scored Mark: " + mmarks)
    }
    else {
      if(pmarks > mmarks)
        println("Id: " + this.id + " Name: " + this.name + " Maximum Scored Mark: " + pmarks)
      else
        println("Id: " + this.id + " Name: " + this.name + " Maximum Scored Mark: " + mmarks)
    }
  }
}
