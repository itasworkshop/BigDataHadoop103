import org.apache.spark.sql.SparkSession


object testbcards {
  def main(args:Array[String]): Unit ={


    val session = SparkSession.builder()
      .appName( name = "blackqvn")
      .config("spark.master","local")
      .getOrCreate();

    val sc = session.sparkContext

    val cards = sc.textFile(path = "D:\\prassadh\\submit\\BigDataHadoop103\\sample_data\\largedeck.txt")
    val count_b_q = cards.filter(x => x.contains(("BLACK")))
    val count_bq = count_b_q.filter(x => x.contains(("Q"))).count()
    println(count_bq)
  }
}
