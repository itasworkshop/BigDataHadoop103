import scala.io.Source
import net.liftweb.json.DefaultFormats
import net.liftweb.json._

case class impressionEvents(app_id: Option[String], advertiser_id: Option[Int],
                           country_code: Option[String], id: Option[String])

case class clickJsons(impression_id: String, revenue: Double)

case class ErrorMsg1(error_message: String)

object BusinessModel extends  App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  // 1. Read events stored in JSON files
  val jsonString = Source.fromResource("impressions.json")
  val jsonImpression = parse(jsonString.mkString)
  var elements = jsonImpression.children

  val jsonString1 = Source.fromResource("clicks.json")
  val json = parse(jsonString1.mkString)
  val elements1 = json.children

  // 2. Calculate metrics for some dimensions
  // Metrics:
  println("Count of Impression Events: " + elements.size)
  println("Count of Click Events: " + elements1.size)

  //Dimensions:


  println("Impression Event: ")
  for (impression <- elements) {
    val imp = impression.extract[impressionEvents]
    if (imp.app_id != null)  {
      println({imp.app_id}, {imp.advertiser_id}, {imp.country_code}, {imp.id})
    }
  }
  println("\n Click Event: ")
  for (click <- elements1) {
    val clk = click.extract[clickJsons]
    if (clk.impression_id != null)   {
      println({clk.impression_id}, {clk.revenue})
    }
  }
}
