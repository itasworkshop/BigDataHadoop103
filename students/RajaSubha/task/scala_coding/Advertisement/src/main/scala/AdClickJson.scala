import net.liftweb.json.DefaultFormats

import scala.io.Source
import net.liftweb.json._

case class AdClickJson(impression_id :String,revenue:Double)

object ParseClickJsonArray extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats;


  val jsonString = Source.fromResource("clicks.json")
  val jsonClick = parse(jsonString.mkString)
  val elements = (jsonClick).children
  for (click <- elements) {
    val c = click.extract[AdClickJson]
    println(s"ClickEvent: ${c.impression_id}, ${c.revenue}")
  }
}