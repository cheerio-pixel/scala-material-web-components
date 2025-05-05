package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-tabs component
  
  */
object Tabs extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/tabs/tabs.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val activeTabIndex: HtmlAttr[Double] = htmlAttr("active-tab-index", DoubleAsStringCodec)
  lazy val autoActivate: HtmlAttr[Boolean] = htmlAttr("auto-activate", BooleanAsAttrPresenceCodec)

  object events {
    val change: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("change")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-tabs")
}
