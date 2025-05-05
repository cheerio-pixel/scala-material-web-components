package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-menu-item component
  
  */
object MenuItem extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/menu/menu-item.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  lazy val `type`: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val tpe: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val typ: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)
  lazy val keepOpen: HtmlAttr[Boolean] = htmlAttr("keep-open", BooleanAsAttrPresenceCodec)
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  lazy val typeaheadText: HtmlAttr[String] = htmlAttr("typeahead-text", StringAsIsCodec)

  object events {
    val closeMenu: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("close-menu")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-menu-item")
}
