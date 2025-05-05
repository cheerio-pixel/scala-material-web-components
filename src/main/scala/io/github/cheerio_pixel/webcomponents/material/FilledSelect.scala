package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-filled-select component
  
  */
object FilledSelect extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/select/filled-select.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val quick: HtmlAttr[Boolean] = htmlAttr("quick", BooleanAsAttrPresenceCodec)
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)
  lazy val errorText: HtmlAttr[String] = htmlAttr("error-text", StringAsIsCodec)
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)
  lazy val noAsterisk: HtmlAttr[Boolean] = htmlAttr("no-asterisk", BooleanAsAttrPresenceCodec)
  lazy val supportingText: HtmlAttr[String] = htmlAttr("supporting-text", StringAsIsCodec)
  lazy val error: HtmlAttr[Boolean] = htmlAttr("error", BooleanAsAttrPresenceCodec)
  lazy val menuPositioning: HtmlAttr[String] = htmlAttr("menu-positioning", StringAsIsCodec)
  lazy val clampMenuWidth: HtmlAttr[Boolean] = htmlAttr("clamp-menu-width", BooleanAsAttrPresenceCodec)
  lazy val typeaheadDelay: HtmlAttr[Double] = htmlAttr("typeahead-delay", DoubleAsStringCodec)
  lazy val hasLeadingIcon: HtmlAttr[Boolean] = htmlAttr("has-leading-icon", BooleanAsAttrPresenceCodec)
  lazy val displayText: HtmlAttr[String] = htmlAttr("display-text", StringAsIsCodec)
  lazy val menuAlign: HtmlAttr[String] = htmlAttr("menu-align", StringAsIsCodec)
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)
  lazy val selectedIndex: HtmlAttr[Double] = htmlAttr("selected-index", DoubleAsStringCodec)
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  object events {
    val change: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("change")
    val input: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("input")
    val opening: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("opening")
    val opened: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("opened")
    val closing: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("closing")
    val closed: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("closed")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-filled-select")
}
