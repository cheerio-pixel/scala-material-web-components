package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** Input chips represent discrete pieces of information entered by a user,
  * such as Gmail contacts or filter options within a search field.
  *
  * @see
  *    <a href="https://material-web.dev/components/chip/#assist-chip">the doc</a> for more information.
  */
object InputChip extends AbstractChip {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/chips/input-chip.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val avatar: HtmlAttr[Boolean] = htmlAttr("avatar", BooleanAsAttrPresenceCodec)
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)
  lazy val removeOnly: HtmlAttr[Boolean] = htmlAttr("remove-only", BooleanAsAttrPresenceCodec)
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)

  object events {
    val remove: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("remove")
    val updateFocus: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("update-focus")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-input-chip")
}
