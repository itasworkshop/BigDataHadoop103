import org.apache.spark.sql.SparkSession

object TestSparkSql {
  def main(args:Array[String]): Unit = {

    val session = SparkSession.builder()
      .appName("App Demo")
      .config("spark.master", "local")
      .getOrCreate();

    val sc = session.sqlContext

    val stdata = sc.read.csv("src/main/resources/student.csv")

    println(stdata.show())


  }

}
