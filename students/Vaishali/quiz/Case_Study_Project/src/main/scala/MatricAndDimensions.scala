import net.liftweb.json.{DefaultFormats, parse}

import scala.io.Source

case class IJson(app_id: Option[String], advertiser_id: Option[Int], country_code: String, id: Option[String])

case class CJson(impression_id :String,revenue:Double)

class MatricAndDimensions extends App {

  implicit val formats: DefaultFormats.type = DefaultFormats

  val jsonstring1=Source.fromResource("impressions.json")
  val json1 = parse(jsonstring1.mkString)
  val elements = (json1).children
  println("The count of impression " + elements.count(z =>true))
  elements.groupBy(e => (e.extract[IJson].app_id, e.extract[IJson].country_code))
    .foreach(e => println(s"Count of Impressions based on per app_id and country: ${e._1}, ${e._2.map(i => i.children).count(z => true)}"))


  val json = Source.fromResource("clicks.json")
  val jsonClick = parse(json.mkString)
  val elementsclick = (jsonClick).children
  println("The count of click " + elementsclick.count(x =>true))

  



}
