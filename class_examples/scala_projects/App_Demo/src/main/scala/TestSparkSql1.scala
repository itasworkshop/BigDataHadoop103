import org.apache.spark.sql.SparkSession

case class Student(id:Int, name:String,grade:String)

object TestSparkSql1 {
  def main(args:Array[String]): Unit = {

    val session = SparkSession.builder()
      .appName("App Demo")
      .config("spark.master", "local")
      .getOrCreate();

    val sc = session.sparkContext

    val stdata = sc.textFile("src/main/resources/student.csv")
      .map(_.split(",")).map( e => Student(e(0).toInt,e(1),e(2)))

    stdata.saveAsTextFile("src/main/resources/output")


  }

}
