import org.apache.spark.sql.SparkSession

object deckofcards{

  def main(args:Array[String]): Unit={

    val session = SparkSession.builder()
        .appName(name= "BlackQueen")
        .config("spark.master","local")
        .getOrCreate();

    val sc = session.sparkContext

    val cards = sc.textFile(path="C:/Users/Nikhil Gaikwad/Downloads/deckofcards.txt")

    val blackqueencards=cards.filter(line=> line.contains("BLACK") && line.contains("Q"))

    println(blackqueencards.count())

    }
  }

