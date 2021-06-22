class GradeofStudent(){
  def CalculateGrade(percentage:Int): Unit ={
    if(percentage >90 && percentage <=100){
      println("The student grade is "+ "Grade A" )
    }else if(percentage > 80 && percentage <= 90){
      println("The student grade is "+ "Grade B")
    }else if(percentage > 70 && percentage <=80){
      println("The student grade is "+ "Grade C")
    }else{
      println("The student grade is "+ "Failure")
    }
  }
}
object StudentGrade {
  def main(args:Array[String]): Unit ={
    var student = new GradeofStudent();
    var student1 = new GradeofStudent();
    var student2 = new GradeofStudent();
    var student3 = new GradeofStudent();
    student.CalculateGrade(94);
    student1.CalculateGrade(81);
    student2.CalculateGrade(75);
    student3.CalculateGrade(57);

  }



}
