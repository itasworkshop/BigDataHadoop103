import org.apache.spark.sql.SparkSession

object CalculateBlackQueens {
  def main(args: Array[String]): Unit = {

    val session = SparkSession.builder().appName("App Demo")
      .config("spark.master", "local")
      .getOrCreate();

    val sc = session.sparkContext
    val cards = sc.textFile("C:\\Users\\star\\Downloads\\BigData103\\BigDataHadoop103\\sample_data\\largedeck.txt")
    println(cards.count())
    val blackCards = cards.filter(line => line.contains("BLACK")).count()
    println("Total Black Cards are: "  + blackCards)
    val  blackQueenCards = cards.filter(line => line.contains("Q")).filter(line => line.contains("BLACK")).count()
    println("Total Black Queen Cards are: " + blackQueenCards)

  }

}
