package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-focus-ring component
   * TODO(b/267336424): add docs
  */
object FocusRing extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/focus/md-focus-ring.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val visible: HtmlAttr[Boolean] = htmlAttr("visible", BooleanAsAttrPresenceCodec)
  lazy val inward: HtmlAttr[Boolean] = htmlAttr("inward", BooleanAsAttrPresenceCodec)

  object events {
    val visibilityChanged: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("visibility-changed")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-focus-ring")
}
