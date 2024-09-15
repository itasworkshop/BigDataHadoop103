import net.liftweb.json.DefaultFormats
import scala.io.Source
import net.liftweb.json._


// a case class to match the JSON data
case class ImpressionJson(
                          app_id: Option[String],
                          advertiser_id: Option[String],
                          country_code: String,
                          id: Option[String]
                    )

object Impression extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats

  // a JSON string that represents a list of EmailAccount instances
  /*
  val jsonString ="""
    {
      "accounts": [
    { "emailAccount": {
      "accountName": "YMail",
      "username": "USERNAME",
      "password": "PASSWORD",
      "url": "imap.yahoo.com",
      "minutesBetweenChecks": 1,
      "usersOfInterest": ["barney", "betty", "wilma"]
    }},
    { "emailAccount": {
      "accountName": "Gmail",
      "username": "USER",
      "password": "PASS",
      "url": "imap.gmail.com",
      "minutesBetweenChecks": 1,
      "usersOfInterest": ["pebbles", "bam-bam"]
    }}]}
    """
   */

  // json is a JValue instance
  //
  // read
  val jsonString = Source.fromResource("impressions.json")
  val json = parse(jsonString.mkString)
  val elements = (json).children
  for (impressions <- elements) {
    val m = impressions.extract[ImpressionJson]
    println(s"ClickEvents: ${m.app_id}, ${m.advertiser_id},${m.country_code},${m.id}")
  }
}

