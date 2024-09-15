import net.liftweb.json.DefaultFormats

import scala.io.Source
import net.liftweb.json._


case class ImpressionsJson(app_id: Option[String], advertiser_id: Option[Int], country_code: String,
                             id: Option[String])

case class ClickJson(impression_id :String,revenue:Double)


object MetricAndDimensions extends App {
  implicit val formats: DefaultFormats.type = DefaultFormats;

  val jsonString = Source.fromResource("impressions.json")
  val jsonImpression = parse(jsonString.mkString)
  val elements = (jsonImpression).children
  println("The count of impression " + elements.count(z =>true))
  elements.groupBy(e => (e.extract[ImpressionsJson].app_id, e.extract[ImpressionsJson].country_code))
    .foreach(e => println(s"Count of Impressions based on per app_id and country: ${e._1}, ${e._2.map(i => i.children).count(z => true)}"))


  val json = Source.fromResource("clicks.json")
  val jsonClick = parse(json.mkString)
  val elementsclick = (jsonClick).children
  println("The count of click " + elementsclick.count(x =>true))

 /* for (impression <- elements) {
    val i = impression.extract[ClickJson]
    val m1 = List(i.revenue).sum.toInt
    println("the sum of revenue is " + m1)
  }*/

}
