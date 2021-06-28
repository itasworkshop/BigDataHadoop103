import org.apache.spark.sql.{SparkSession, functions}

case class business(id:String, app_Id:Integer, country_Code:String,adviser_id:Integer)

object Applications {
  def main(args: Array[String]): Unit = {
    val session =SparkSession.builder().appName("Welcome to Display")
      .config("spark.master","local").getOrCreate()


    val sc = session.sqlContext

    val fetch = sc.read.json("File:/home/alex/Samples/impressions.json")
      .randomSplit(splitt match {
        case id => app_id
      })

    println(fetch.show())
  }


}
