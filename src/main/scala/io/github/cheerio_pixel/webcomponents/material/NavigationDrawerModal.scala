package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-navigation-drawer-modal component
  
  */
object NavigationDrawerModal extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/labs/navigationdrawer/navigation-drawer-modal.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val opened: HtmlAttr[Boolean] = htmlAttr("opened", BooleanAsAttrPresenceCodec)
  lazy val pivot: HtmlAttr[String] = htmlAttr("pivot", StringAsIsCodec)

  object events {
    val navigationDrawerChanged: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("navigation-drawer-changed")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-navigation-drawer-modal")
}
