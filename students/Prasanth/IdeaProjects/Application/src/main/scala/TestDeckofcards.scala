import org.apache.spark.sql.SparkSession

object TestDeckofcards {
  def main(args: Array[String]): Unit = {

    val session = SparkSession.builder()
      .appName("Apps")
      .config("spark.master", "local")
      .getOrCreate()

    val sc = session.sparkContext
    val cards = sc.textFile("File:/home/alex/Samples/deckofcards.txt")
    val blackCards = cards.filter(x => x.contains("BLACK"))
    val blackQueenCards = blackCards.filter(x => x.contains("Q"))
    println(cards.count(),blackCards.count(),blackQueenCards.count())

    //val cards1 = sc

  }

}
