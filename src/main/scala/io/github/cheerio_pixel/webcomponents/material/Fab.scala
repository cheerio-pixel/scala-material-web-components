package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{
  BooleanAsAttrPresenceCodec,
  StringAsIsCodec,
  DoubleAsStringCodec
}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent
import io.github.cheerio_pixel.webcomponents.material.configkeys.FabVariant
import io.github.cheerio_pixel.webcomponents.material.configkeys.Size

/** md-fab component
  */
object Fab extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/fab/fab.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement

  /** The FAB color variant to render (default: 'surface'). Possible variants
    * include:
    *   - 'surface' (default)
    *   - 'primary'
    *   - 'secondary'
    *   - 'tertiary'
    */
  lazy val variant: HtmlAttr[FabVariant] = htmlAttr("variant", FabVariant.AsStringCodec)

  /** The size of the FAB (default: 'medium'). Possible sizes:
    *   - 'small' (not available for branded FABs)
    *   - 'medium'
    *   - 'large'
    *
    * Note: Branded FABs cannot be sized to small, and Extended FABs do not have
    * different sizes.
    */
  lazy val size: HtmlAttr[Size] = htmlAttr("size", Size.AsStringCodec)

  /** The text label to display on the FAB (for extended FABs). */
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)

  /** Whether the FAB has lowered elevation (reduced shadow effect). */
  lazy val lowered: HtmlAttr[Boolean] =
    htmlAttr("lowered", BooleanAsAttrPresenceCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-fab")
}
