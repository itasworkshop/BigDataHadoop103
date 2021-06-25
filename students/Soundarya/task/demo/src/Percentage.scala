class Markss(id:Int,name:String,m1:Int,m2:Int,m3:Int) {
  def test():Int={
    var perc = (this.m1 + this.m2 + this.m3) / 3
    return perc
  }
}
object Percentage {
  def main(args:Array[String]):Unit={
    var s1=new Markss(101,"sam",45,m2=55,m3=67)
    var s2=new Markss(102,"jam",65,m2=85,m3=77)
    var s3=new Markss(103,"kumar",43,m2=55,m3=60)
    var s4=new Markss(104,"ashok",71,m2=65,m3=70)
    var per1: Int=s1.test();
    var per2: Int=s2.test();
    var per3: Int=s3.test()
    var per4: Int=s4.test();
    if(per1>per2 && per1>per3 &&per1>per4){
      println("Maxmimum Percentage is "+ per1)
    }
    else if(per2>per1 && per2>per3 && per2>per4){
      println("Maxmimum Percentage is "+per2)
    }
    else if(per3>per2 && per3>per1 && per3>per4){
      println("Maxmimum Percentage is "+per3)
    }
    else if(per4>per2 && per4>per3 && per4>per1){
      println("Maxmimum Percentage is "+per4)
    }
  }

  }

