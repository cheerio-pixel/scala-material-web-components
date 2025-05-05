package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-select-option component
  
  */
object SelectOption extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/select/select-option.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  lazy val mdMenuItem: HtmlAttr[Boolean] = htmlAttr("md-menu-item", BooleanAsAttrPresenceCodec)
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)
  lazy val typeaheadText: HtmlAttr[String] = htmlAttr("typeahead-text", StringAsIsCodec)
  lazy val displayText: HtmlAttr[String] = htmlAttr("display-text", StringAsIsCodec)

  object events {
    val closeMenu: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("close-menu")
    val requestSelection: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("request-selection")
    val requestDeselection: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("request-deselection")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-select-option")
}
