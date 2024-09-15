import org.apache.spark.sql.SparkSession
object BlackQueens
{
    def main(args: Array[String]): Unit = {
        val sess = SparkSession.builder()
        .appName(name = "App Demo")
        .config("spark.master","local")
        .getOrCreate()

        val scnt  =sess.sparkContext

        val cards = scnt.textFile(path = "G:\\Sampledata\\largedeck.txt") 
        println(cards.filter(value => value.contains("BLACK")).filter(value => value.contains("Q"))
    }
}