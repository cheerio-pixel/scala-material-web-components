package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-list-item component
  
  */
object ListItem extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/list/list-item.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val `type`: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val tpe: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val typ: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val mdListItem: HtmlAttr[Boolean] = htmlAttr("md-list-item", BooleanAsAttrPresenceCodec)
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  object events {
    val requestActivation: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("request-activation")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-list-item")
}
