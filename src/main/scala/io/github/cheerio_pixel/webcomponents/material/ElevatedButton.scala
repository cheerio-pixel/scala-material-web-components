package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** Elevated buttons are essentially filled tonal
  * buttons with a shadow. To prevent shadow creep,
  * only use them when absolutely necessary, such as
  * when the button requires visual separation from
  * a patterned background.
  *
  * @see
  *    <a href="https://material-web.dev/components/button/#elevated-button">the doc</a> for more information.
  */
object ElevatedButton extends AbstractButton {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/button/elevated-button.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-elevated-button")
}
