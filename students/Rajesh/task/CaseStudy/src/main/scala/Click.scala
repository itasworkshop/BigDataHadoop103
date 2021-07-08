import net.liftweb.json.DefaultFormats
import scala.io.Source
import net.liftweb.json._


// a case class to match the JSON data
case class ClickJson(
                         impression_id: String,
                         revenue: Double
                       )

object Click extends App {
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
  val jsonString = Source.fromResource("clicks.json")
  val json = parse(jsonString.mkString)
  val elements = (json).children
  for (clicks <- elements) {
    val m = clicks.extract[ClickJson]
    println(s"ClickEvents: ${m.impression_id}, ${m.revenue}")
  }
}




