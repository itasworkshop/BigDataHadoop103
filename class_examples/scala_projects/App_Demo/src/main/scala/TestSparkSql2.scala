import org.apache.spark.sql.SparkSession

object TestSparkSql2 {
  def main(args:Array[String]): Unit = {

    val session = SparkSession.builder()
      .appName("App Demo")
      .config("spark.master", "local")
      .getOrCreate();

    val sc = session.sqlContext

    val stdata = sc.read.json("src/main/resources/student.json")

    println(stdata.show())
    println(stdata.printSchema())

    println(stdata.select("name").show())

    println(stdata.filter(stdata("grade") === "A").show())

    println(stdata.groupBy("grade").count().show())


  }

}
