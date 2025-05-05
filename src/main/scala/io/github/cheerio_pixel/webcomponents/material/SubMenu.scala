package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-sub-menu component
  
  */
object SubMenu extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/menu/sub-menu.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val anchorCorner: HtmlAttr[String] = htmlAttr("anchor-corner", StringAsIsCodec)
  lazy val menuCorner: HtmlAttr[String] = htmlAttr("menu-corner", StringAsIsCodec)
  lazy val hoverOpenDelay: HtmlAttr[Double] = htmlAttr("hover-open-delay", DoubleAsStringCodec)
  lazy val hoverCloseDelay: HtmlAttr[Double] = htmlAttr("hover-close-delay", DoubleAsStringCodec)
  lazy val mdSubMenu: HtmlAttr[Boolean] = htmlAttr("md-sub-menu", BooleanAsAttrPresenceCodec)

  object events {
    val deactivateItems: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("deactivate-items")
    val requestActivation: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("request-activation")
    val deactivateTypeahead: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("deactivate-typeahead")
    val activateTypeahead: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("activate-typeahead")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-sub-menu")
}
