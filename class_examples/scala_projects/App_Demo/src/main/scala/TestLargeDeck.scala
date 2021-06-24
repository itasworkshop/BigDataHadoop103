import org.apache.spark.sql.SparkSession

object TestLargeDeck {

  def main(args:Array[String]): Unit ={

    val session = SparkSession.builder()
      .appName("App Demo")
      .config("spark.master","local")
      .getOrCreate();

    val sc = session.sparkContext

    val cards = sc.textFile("hdfs://localhost:9000/largedeck.txt")

    val blackcards = cards.filter(x => x.contains("BLACK") && x.contains("Q"))
    //println(cards.count())

    blackcards.saveAsTextFile("hdfs://localhost:9000/result7")
  }
}
