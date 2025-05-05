package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-navigation-tab component
  
  */
object NavigationTab extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/labs/navigationtab/navigation-tab.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)
  lazy val badgeValue: HtmlAttr[String] = htmlAttr("badge-value", StringAsIsCodec)
  lazy val showBadge: HtmlAttr[Boolean] = htmlAttr("show-badge", BooleanAsAttrPresenceCodec)
  lazy val active: HtmlAttr[Boolean] = htmlAttr("active", BooleanAsAttrPresenceCodec)
  lazy val hideInactiveLabel: HtmlAttr[Boolean] = htmlAttr("hide-inactive-label", BooleanAsAttrPresenceCodec)

  object events {
    val navigationTabRendered: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("navigation-tab-rendered")
    val navigationTabInteraction: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("navigation-tab-interaction")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-navigation-tab")
}
