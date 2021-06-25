class student{
  var id:Int= 201
  var name:String = "raj"
  def PrintMe():Unit ={
     println("the id is "+id+ "the name is"+ name)
  }
}


object TestStudent {
  def main(args : Array[String] ){
    var stud = new student()
    stud.PrintMe();
  }
}
