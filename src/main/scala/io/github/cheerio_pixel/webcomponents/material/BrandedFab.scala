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
import io.github.cheerio_pixel.webcomponents.material.configkeys.BrandedFabSize
import io.github.cheerio_pixel.webcomponents.material.configkeys.FabVariant

/** Branded FABs use a brightly colored logo for their icon. Unlike FAB, branded
  * FABs do not have color variants.
  *
  * @see
  *   <a href="https://material-web.dev/components/fab/#branded-fab">the doc</a>
  *   for more information.
  */
object BrandedFab extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/fab/branded-fab.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement

  /** The FAB color variant to render.
    */
  lazy val variant: HtmlAttr[FabVariant] =
    htmlAttr("variant", FabVariant.AsStringCodec)

  /** The size of the FAB.
    *
    * @note
    *   Branded FABs cannot be sized to small, and Extended FABs do not have
    *   different sizes.
    */
  lazy val size: HtmlAttr[BrandedFabSize] =
    htmlAttr("size", BrandedFabSize.AsStringCodec)

  /** The text to display on the FAB.
    *
    */
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)

  /** Lowers the FAB's elevation.
    *
    */
  lazy val lowered: HtmlAttr[Boolean] =
    htmlAttr("lowered", BooleanAsAttrPresenceCodec)

  object slots {
    val icon = Slot("icon")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-branded-fab")
}
