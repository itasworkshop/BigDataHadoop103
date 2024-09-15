import net.liftweb.json.DefaultFormats
import scala.io.Source
import net.liftweb.json._

case class impressions
(
  id: Option[String],
  app_id: Option[String],
  country_code: Option[String],
  advertiser_id: Option[Int]
)

case class clicks
(
  impression_id: String,
  revenue: Double
)

object ParseJson extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats
  val jsonString = Source.fromResource("impressions.json")
  println(jsonString)
  val jsonImpression = parse(jsonString.mkString)
  println(jsonImpression)
  val elements = jsonImpression.children
  for (impression <- elements) {
    val m = impression.extract[impressions]
    if (m.app_id != null) {
      println({m.app_id}, {m.advertiser_id}, {m.country_code}, {m.id})
    }
  }
  //ClickEvent
  val jsonString1 = Source.fromResource("clicks.json")
  println(jsonString1)
  val jsonClick = parse(jsonString1.mkString)
  println(jsonClick)
  val elements1 = jsonClick.children
  for (click <- elements1) {
    val clk = click.extract[clicks]
    if (clk.impression_id != null) {
      println({clk.impression_id}, {clk.revenue})
    }
  }
  // Calculate metrics for some dimensions
  println("Count of Impression Events: " + elements.size)
  println("Count of Click Events: " + elements1.size)

  // Sum Of Revenue
  for (click <- elements) {
    val rev = click.extract[clicks]
    if (rev != null) {
      println("")
    }
  }

}

