import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}
//run your netcat
//nc -lk 9999 then give message it will calculate
object TestStreaming {
  def main(args:Array[String]): Unit = {
    val conf = new SparkConf().setMaster("local[2]").setAppName("demo my streaming app")
    val ssc = new StreamingContext(conf,Seconds(10))
    val lines = ssc.socketTextStream("localhost",9999)

    //lines.map(x => println("from lines",x))
    //lines.print()

    lines.filter(x => x.contains("BLACK") && x.contains("Q")).count().print()

    ssc.start()
    ssc.awaitTermination()
  }

}
