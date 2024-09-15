import net.liftweb.json.DefaultFormats
import scala.io.Source
import net.liftweb.json._

case class ClickJson(impression_id: String, revenue: Double)

object ClickEvent extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  val jsonString = Source.fromResource("clicks.json")
  val json = parse(jsonString.mkString)
  val elements = json.children

  // Count of Impression Id


  // Sum Of Revenue
  for (clicks <- elements) {
    val rev = clicks.extract[ClickJson]
    if (rev != null) {
      println("")
    }
  }

  // Display List of Impression Id & Revenue
  println("ClickEvents: ")
  for (clicks <- elements) {
    val res = clicks.extract[ClickJson]
    if (res != null) {
      println({res.impression_id}, {res.revenue})

    }
    val lis = List(res.revenue).size
    println(lis)
    //var countItem = 0
    /*println("Counts of Click Events: " +m.impression_id.count())
    val sumofRevenue = List(m.revenue)
    println("Sum of Revenue: " +sumofRevenue.sum)*/

  }
}