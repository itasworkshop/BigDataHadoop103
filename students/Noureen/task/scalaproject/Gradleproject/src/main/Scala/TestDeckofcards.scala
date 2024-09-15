import org.apache.spark.sql.SparkSession

object TestDeckofcards {
  def main(args: Array[String]): Unit = {

    val session = SparkSession.builder().appName("App_Demo")
      .config("spark.master", "local")
      .getOrCreate()

    val sc = session.sparkContext
    val cards = sc.textFile("file:/Users/Noureen/Documents/deckofcards.txt")
    val blackCards = cards.filter(jline=>jline.contains("BLACK"))
    val blackQueenCards = cards.filter(jline=>jline.contains("Q"))
    println(cards.count(),blackCards.count(),blackQueenCards.count())

    val cards1 = sc

  }

}
