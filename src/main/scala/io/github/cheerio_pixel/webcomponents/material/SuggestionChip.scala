package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** Suggestion chips help narrow a user’s intent by presenting
  * dynamically generated suggestions, such as possible
  * responses or search filters.
  *
  * @see
  *    <a href="https://material-web.dev/components/chip/#assist-chip">the doc</a> for more information.
  */
object SuggestionChip extends AbstractChip {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/chips/suggestion-chip.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement

  lazy val elevated: HtmlAttr[Boolean] = htmlAttr("elevated", BooleanAsAttrPresenceCodec)
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)
  lazy val download: HtmlAttr[String] = htmlAttr("download", StringAsIsCodec)
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)

  object events {
    val updateFocus: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("update-focus")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-suggestion-chip")
}
