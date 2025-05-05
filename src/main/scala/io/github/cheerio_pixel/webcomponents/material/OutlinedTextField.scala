package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-outlined-text-field component
   * TODO(b/228525797): Add docs
  */
object OutlinedTextField extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/textfield/outlined-text-field.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val error: HtmlAttr[Boolean] = htmlAttr("error", BooleanAsAttrPresenceCodec)
  lazy val errorText: HtmlAttr[String] = htmlAttr("error-text", StringAsIsCodec)
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)
  lazy val noAsterisk: HtmlAttr[Boolean] = htmlAttr("no-asterisk", BooleanAsAttrPresenceCodec)
  lazy val required: HtmlAttr[Boolean] = htmlAttr("required", BooleanAsAttrPresenceCodec)
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)
  lazy val prefixText: HtmlAttr[String] = htmlAttr("prefix-text", StringAsIsCodec)
  lazy val suffixText: HtmlAttr[String] = htmlAttr("suffix-text", StringAsIsCodec)
  lazy val hasLeadingIcon: HtmlAttr[Boolean] = htmlAttr("has-leading-icon", BooleanAsAttrPresenceCodec)
  lazy val hasTrailingIcon: HtmlAttr[Boolean] = htmlAttr("has-trailing-icon", BooleanAsAttrPresenceCodec)
  lazy val supportingText: HtmlAttr[String] = htmlAttr("supporting-text", StringAsIsCodec)
  lazy val textDirection: HtmlAttr[String] = htmlAttr("text-direction", StringAsIsCodec)
  lazy val rows: HtmlAttr[Double] = htmlAttr("rows", DoubleAsStringCodec)
  lazy val cols: HtmlAttr[Double] = htmlAttr("cols", DoubleAsStringCodec)
  lazy val inputMode: HtmlAttr[String] = htmlAttr("inputMode", StringAsIsCodec)
  lazy val max: HtmlAttr[String] = htmlAttr("max", StringAsIsCodec)
  lazy val maxLength: HtmlAttr[Double] = htmlAttr("maxLength", DoubleAsStringCodec)
  lazy val min: HtmlAttr[String] = htmlAttr("min", StringAsIsCodec)
  lazy val minLength: HtmlAttr[Double] = htmlAttr("minLength", DoubleAsStringCodec)
  lazy val noSpinner: HtmlAttr[Boolean] = htmlAttr("no-spinner", BooleanAsAttrPresenceCodec)
  lazy val pattern: HtmlAttr[String] = htmlAttr("pattern", StringAsIsCodec)
  lazy val placeholder: HtmlAttr[String] = htmlAttr("placeholder", StringAsIsCodec)
  lazy val readOnly: HtmlAttr[Boolean] = htmlAttr("readOnly", BooleanAsAttrPresenceCodec)
  lazy val multiple: HtmlAttr[Boolean] = htmlAttr("multiple", BooleanAsAttrPresenceCodec)
  lazy val step: HtmlAttr[String] = htmlAttr("step", StringAsIsCodec)
  lazy val `type`: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val tpe: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val typ: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)
  lazy val autocomplete: HtmlAttr[String] = htmlAttr("autocomplete", StringAsIsCodec)
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  object events {
    val select: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("select")
    val change: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("change")
    val input: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("input")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-outlined-text-field")
}
