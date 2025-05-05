package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-item component
   * An item layout component that can be used inside list items to give them
their customizable structure.

`<md-item>` does not have any functionality, which must be added by the
component using it.

All text will wrap unless `white-space: nowrap` is set on the item or any of
its children.

Slots available:
- `<default>`: The headline, or custom content.
- `headline`: The first line.
- `supporting-text`: Supporting text lines underneath the headline.
- `trailing-supporting-text`: A small text snippet at the end of the item.
- `start`: Any leading content, such as icons, avatars, or checkboxes.
- `end`: Any trailing content, such as icons and buttons.
- `container`: Background container content, intended for adding additional
    styles, such as ripples or focus rings.
  */
object Item extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/labs/item/item.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val multiline: HtmlAttr[Boolean] = htmlAttr("multiline", BooleanAsAttrPresenceCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-item")
}
