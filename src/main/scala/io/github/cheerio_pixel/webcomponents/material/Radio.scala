package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-radio component
  
  */
object Radio extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/radio/radio.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val checked: HtmlAttr[Boolean] = htmlAttr("checked", BooleanAsAttrPresenceCodec)
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  lazy val tabIndex: HtmlAttr[Double] = htmlAttr("tabIndex", DoubleAsStringCodec)

  object events {
    val input: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("input")
    val change: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("change")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-radio")
}
