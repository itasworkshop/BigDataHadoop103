class Marks(name:String,x:Int) {
  def test() {
    for (this.x <- 90 to 100 if this.x >= 90; if this.x <= 100) {
      println(this.name+" :Grade is A")
    }
    for (this.x <- 80 to 90 if this.x >= 80; if this.x < 90) {
      println(this.name+" :Grade is B")
    }
    for (this.x <- 70 to 80 if this.x >= 70; if this.x < 80) {
      println(this.name+" :Grade is C")
    }
    for (this.x <- 1 to 70 if this.x >= 1; if this.x < 70) {
      println(this.name+" :Grade is Fail")
    }
  }
}
object Grade {
  def main(args:Array[String]):Unit={
   var s1=new Marks("sam",95)
    var s2=new Marks("jam",85)
    var s3=new Marks("kumar",75)
    var s4=new Marks("ashok",65)
    s1.test();
    s2.test();
    s3.test();
    s4.test();

  }
}
