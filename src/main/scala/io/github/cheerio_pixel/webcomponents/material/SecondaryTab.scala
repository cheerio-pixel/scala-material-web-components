package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-secondary-tab component
  
  */
object SecondaryTab extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/tabs/secondary-tab.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val mdTab: HtmlAttr[String] = htmlAttr("md-tab", StringAsIsCodec)
  lazy val active: HtmlAttr[Boolean] = htmlAttr("active", BooleanAsAttrPresenceCodec)
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  lazy val hasIcon: HtmlAttr[Boolean] = htmlAttr("has-icon", BooleanAsAttrPresenceCodec)
  lazy val iconOnly: HtmlAttr[Boolean] = htmlAttr("icon-only", BooleanAsAttrPresenceCodec)
  lazy val tabIndex: HtmlAttr[Double] = htmlAttr("tabIndex", DoubleAsStringCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-secondary-tab")
}
