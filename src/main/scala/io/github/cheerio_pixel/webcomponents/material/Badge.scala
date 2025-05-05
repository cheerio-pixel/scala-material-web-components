package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-badge component
  
  */
object Badge extends WebComponent {
  @js.native
  trait RawElement extends js.Object {
    def value: String = js.native
  }

  @js.native
  @JSImport("@material/web/labs/badge/badge.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-badge")
}
