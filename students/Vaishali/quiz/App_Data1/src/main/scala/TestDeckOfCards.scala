import org.apache.spark.sql.SparkSession
import scala.io.StdIn.{readLine,readInt}

object TestDeckOfCards {

  def main(args: Array[String]) : Unit ={

  val session = SparkSession.builder()
    .appName("App_Demo1")
    .config("spark.master","local")
    .getOrCreate()

    val sc=session.sparkContext

    val cards= sc.textFile("file:\\H:\\Software\\largedeck.txt")

    val blackqueen=cards.filter(x => x.contains("BLACK") && x.contains("Q"))

    println(blackqueen.count())

  }

}
