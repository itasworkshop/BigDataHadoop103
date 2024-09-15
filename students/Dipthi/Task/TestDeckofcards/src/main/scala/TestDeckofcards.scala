import org.apache.spark.sql.SparkSession
object TestDeckofcards {
  def main(args:Array[String]):Unit={
    val session=SparkSession.builder().appName(name="App_Demo1").config("spark.master","local").getOrCreate()
    val sc=session.sparkContext
    val cards=sc.textFile(path="E:/Dipthi/largedeck.txt")
    println(cards.count())
    val blackqueens=cards.filter(line=>line.contains("Q")).filter(line=>line.contains("BLACK")).count()
    println("BlackQueens count is"+blackqueens)
  }
}