class Student {

  var id, cmarks, pmarks, mmarks, total, perc: Int = 0
  var name: String = ""

  def setData(i: Int, n: String, cm: Int, pm: Int, nm: Int): Unit = {
    this.id = i
    this.name = n
    this.cmarks = cm
    this.pmarks = pm
    this.mmarks = nm
    this.total = cm + pm + nm
    this.perc = this.total / 3
  }

  def showData(): Unit = {
    println("Student ID " + this.id + " Name " + this.name + " CMarks " + this.cmarks + " PMarks " + this.pmarks + " MMarks " + this.mmarks)
    println("Total Marks of Three Subject : " + this.total)
    println("Percentage : " + this.perc)

  }

  object sortData {
    def main(args: Array[String]): Unit = {
      var stud = Array.fill[Student](4)(new Student())
      stud(0).setData(101, "Raj", 45, 55, 67)
      stud(0).setData(102, "Rajesh", 65, 85, 77)
      stud(0).setData(103, "Suraj", 43, 55, 60)
      stud(0).setData(104, "Tom", 71, 65, 70)

      var temp = new Student()
      for (i <- 0 to 3) {
        for (j <- i to 3) {
          if (stud(i).total < stud(j).total) {
            temp = stud(i)
            stud(i) = stud(j)
            stud(j) = temp

          }
        }
      }

      for (i <- 0 to 3) {
        stud(i).showData()
        println("")
      }

    }
  }
}
