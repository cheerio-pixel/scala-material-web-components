package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** Circular progress indicators display progress by
  * animating along an invisible circular track in a clockwise direction
  *
  * @see
  *    <a href="https://material-web.dev/components/progress/#circular-progress">the doc</a> for more information.
  */
object CircularProgress extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/progress/circular-progress.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val value: HtmlAttr[Double] = htmlAttr("value", DoubleAsStringCodec)
  lazy val max: HtmlAttr[Double] = htmlAttr("max", DoubleAsStringCodec)
  lazy val indeterminate: HtmlAttr[Boolean] = htmlAttr("indeterminate", BooleanAsAttrPresenceCodec)
  lazy val fourColor: HtmlAttr[Boolean] = htmlAttr("four-color", BooleanAsAttrPresenceCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-circular-progress")
}
