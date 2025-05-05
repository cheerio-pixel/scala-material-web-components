package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-outlined-field component
   * TODO(b/228525797): add docs
  */
object OutlinedField extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/field/outlined-field.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  lazy val error: HtmlAttr[Boolean] = htmlAttr("error", BooleanAsAttrPresenceCodec)
  lazy val focused: HtmlAttr[Boolean] = htmlAttr("focused", BooleanAsAttrPresenceCodec)
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)
  lazy val noAsterisk: HtmlAttr[Boolean] = htmlAttr("no-asterisk", BooleanAsAttrPresenceCodec)
  lazy val populated: HtmlAttr[Boolean] = htmlAttr("populated", BooleanAsAttrPresenceCodec)
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)
  lazy val resizable: HtmlAttr[Boolean] = htmlAttr("resizable", BooleanAsAttrPresenceCodec)
  lazy val supportingText: HtmlAttr[String] = htmlAttr("supporting-text", StringAsIsCodec)
  lazy val errorText: HtmlAttr[String] = htmlAttr("error-text", StringAsIsCodec)
  lazy val count: HtmlAttr[Double] = htmlAttr("count", DoubleAsStringCodec)
  lazy val max: HtmlAttr[Double] = htmlAttr("max", DoubleAsStringCodec)
  lazy val hasStart: HtmlAttr[Boolean] = htmlAttr("has-start", BooleanAsAttrPresenceCodec)
  lazy val hasEnd: HtmlAttr[Boolean] = htmlAttr("has-end", BooleanAsAttrPresenceCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-outlined-field")
}
