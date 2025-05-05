package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-linear-progress component
  
  */
object LinearProgress extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/progress/linear-progress.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val buffer: HtmlAttr[Double] = htmlAttr("buffer", DoubleAsStringCodec)
  lazy val value: HtmlAttr[Double] = htmlAttr("value", DoubleAsStringCodec)
  lazy val max: HtmlAttr[Double] = htmlAttr("max", DoubleAsStringCodec)
  lazy val indeterminate: HtmlAttr[Boolean] = htmlAttr("indeterminate", BooleanAsAttrPresenceCodec)
  lazy val fourColor: HtmlAttr[Boolean] = htmlAttr("four-color", BooleanAsAttrPresenceCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-linear-progress")
}
