import net.liftweb.json.DefaultFormats
import net.liftweb.json._

import scala.io.Source


case class impression(app_id:Option[String],advertiser_id:Option[Int],country_code:Option[String],id:Option[String])

case class clicks(impression_id:String,revenue:Double)

object ReadEvents extends App {

  implicit val formats: DefaultFormats.type = DefaultFormats
  //1.Read events stored in JSON files
  val jsonstring1=Source.fromResource("impressions.json")
  val json1 = parse(jsonstring1.mkString)
  var elements1 = json1.children
  for (inter <- elements1) {
    val m = inter.extract[impression]
   //println(s"Impression: ${m.id}, ${m.app_id}, ${m.country_code},${m.advertiser_id}")
   // println("Impression "+ m.id +" "+ m.app_id+" "+m.country_code+" "+m.advertiser_id)
  }

    val jsonstring2=Source.fromResource("clicks.json")
    val jsonImpression2 = parse(jsonstring2.mkString)
    var elements2 = jsonImpression2.children
    for (click <- elements2) {
    val c = click.extract[clicks]
 //   println(s"Clicks: ${c.impression_id}, ${c.revenue}")
  }

    //2.Calculate matrices for some events
    println("Total count of imressions events "+elements1)
    println("Total count of clicks events "+elements2)

    //Impression Event
    for(imp <- elements1)
      {
        val i=imp.extract[impression]
        if(i.app_id != null)
          {
            println({i.app_id}, {i.advertiser_id}, {i.country_code}, {i.id})
          }
      }

}

