import net.liftweb.json.DefaultFormats
import scala.io.Source
import net.liftweb.json._

case class AdImpressionsJson(app_id: Option[String], advertiser_id: Option[Int], country_code: String,
                        id: Option[String])

object ParseImpressionJsonArray extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats;

  val jsonString = Source.fromResource("impressions.json")
  val jsonImpression = parse(jsonString.mkString)
  val elements = (jsonImpression).children
  for (impression <- elements) {
    val i = impression.extract[AdImpressionsJson]
    println(s"Impression Events: ${i.app_id}, ${i.advertiser_id},${i.country_code},${i.id}")
  }
}