package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** Filter chips use tags or descriptive words to filter content.
  * They can be a good alternative to toggle buttons or checkboxes.
  *
  * @see
  *    <a href="https://material-web.dev/components/chip/#assist-chip">the doc</a> for more information.
  */
object FilterChip extends AbstractChip {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/chips/filter-chip.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement

  lazy val elevated: HtmlAttr[Boolean] = htmlAttr("elevated", BooleanAsAttrPresenceCodec)
  lazy val removable: HtmlAttr[Boolean] = htmlAttr("removable", BooleanAsAttrPresenceCodec)
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  lazy val hasSelectedIcon: HtmlAttr[Boolean] = htmlAttr("has-selected-icon", BooleanAsAttrPresenceCodec)

  object events {
    val remove: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("remove")
    val updateFocus: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("update-focus")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-filter-chip")
}
