import org.apache.spark.sql.SparkSession
import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object TestDeckofcards {
  def main(args:Array[String]):Unit ={
    val session = SparkSession.builder().appName(name = "CardTest")
      .config("spark.master","local").getOrCreate();
    val sc = session.sparkContext
    val cards =sc.textFile("file:/D:/bigdata/BigData103/BigDataHadoop103/sample_data/deckofcards.txt")
    println("The number of cards present in deckofcards is  " + cards.count())
    val blackQueenCount = cards.filter(value => value.contains("BLACK")).filter(value=>value.contains("Q"))
    println("Black Queen Cards = "+blackQueenCount.count())
  }
}
