import scala.io.Source
import net.liftweb.json.DefaultFormats
import net.liftweb.json._

case class impressionEvent(app_id: Option[String], advertiser_id: Option[Int],
                           country_code: Option[String], id: Option[String])

case class ErrorMsg(error_message: String)

object Applications extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  val jsonString = Source.fromResource("impressions.json")
  val jsonImpression = parse(jsonString.mkString)
  val elements = jsonImpression.children


  println("Impression Event: ")
  for (impression <- elements) {
    val imp = impression.extract[impressionEvent]
    if (imp.app_id != null) {
      println({imp.app_id}, {imp.advertiser_id},{imp.country_code},{imp.id})
    }

  }

}