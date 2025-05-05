package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** A divider is a thin line that groups content in
  * lists and containers.
  *
  * Dividers can reinforce tapability, such as when
  * used to separate list items or define tappable
  * regions in an accordion.
  *
  * @see
  *    <a href="https://material-web.dev/components/divider/">the doc</a> for more information.
  */
object Divider extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/divider/divider.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val inset: HtmlAttr[Boolean] = htmlAttr("inset", BooleanAsAttrPresenceCodec)
  lazy val insetStart: HtmlAttr[Boolean] = htmlAttr("inset-start", BooleanAsAttrPresenceCodec)
  lazy val insetEnd: HtmlAttr[Boolean] = htmlAttr("inset-end", BooleanAsAttrPresenceCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-divider")
}
