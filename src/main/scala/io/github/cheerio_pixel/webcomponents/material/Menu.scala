package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-menu component
  
  */
object Menu extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/menu/menu.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val anchor: HtmlAttr[String] = htmlAttr("anchor", StringAsIsCodec)
  lazy val positioning: HtmlAttr[String] = htmlAttr("positioning", StringAsIsCodec)
  lazy val quick: HtmlAttr[Boolean] = htmlAttr("quick", BooleanAsAttrPresenceCodec)
  lazy val hasOverflow: HtmlAttr[Boolean] = htmlAttr("has-overflow", BooleanAsAttrPresenceCodec)
  lazy val open: HtmlAttr[Boolean] = htmlAttr("open", BooleanAsAttrPresenceCodec)
  lazy val xOffset: HtmlAttr[Double] = htmlAttr("x-offset", DoubleAsStringCodec)
  lazy val yOffset: HtmlAttr[Double] = htmlAttr("y-offset", DoubleAsStringCodec)
  lazy val noHorizontalFlip: HtmlAttr[Boolean] = htmlAttr("no-horizontal-flip", BooleanAsAttrPresenceCodec)
  lazy val noVerticalFlip: HtmlAttr[Boolean] = htmlAttr("no-vertical-flip", BooleanAsAttrPresenceCodec)
  lazy val typeaheadDelay: HtmlAttr[Double] = htmlAttr("typeahead-delay", DoubleAsStringCodec)
  lazy val anchorCorner: HtmlAttr[String] = htmlAttr("anchor-corner", StringAsIsCodec)
  lazy val menuCorner: HtmlAttr[String] = htmlAttr("menu-corner", StringAsIsCodec)
  lazy val stayOpenOnOutsideClick: HtmlAttr[Boolean] = htmlAttr("stay-open-on-outside-click", BooleanAsAttrPresenceCodec)
  lazy val stayOpenOnFocusout: HtmlAttr[Boolean] = htmlAttr("stay-open-on-focusout", BooleanAsAttrPresenceCodec)
  lazy val skipRestoreFocus: HtmlAttr[Boolean] = htmlAttr("skip-restore-focus", BooleanAsAttrPresenceCodec)
  lazy val defaultFocus: HtmlAttr[String] = htmlAttr("default-focus", StringAsIsCodec)
  lazy val noNavigationWrap: HtmlAttr[Boolean] = htmlAttr("no-navigation-wrap", BooleanAsAttrPresenceCodec)

  object events {
    val opening: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("opening")
    val opened: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("opened")
    val closing: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("closing")
    val closed: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("closed")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-menu")
}
