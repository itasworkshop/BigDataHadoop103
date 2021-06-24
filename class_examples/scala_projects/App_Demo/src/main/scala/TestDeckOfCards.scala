import org.apache.spark.sql.SparkSession

object TestDeckOfCards {

  def main(args:Array[String]): Unit ={

    val session = SparkSession.builder()
      .appName("App Demo")
      .config("spark.master","local")
      .getOrCreate();

    val sc = session.sparkContext

    val cards = sc.textFile("file:/home/praveen/Development/BigDataHadoop103/sample_data/deckofcards.txt")

    println(cards.count())
  }
}
