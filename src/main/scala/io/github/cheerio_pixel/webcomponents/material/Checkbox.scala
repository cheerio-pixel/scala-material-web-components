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

/** Checkboxes allow users to select one or more items from a set. Checkboxes
  * can turn an option on or off.
  *
  * @see
  *   <a href="https://material-web.dev/components/checkbox/">the doc</a> for
  *   more information.
  */
object Checkbox extends WebComponent {
  @js.native
  trait RawElement extends js.Object {
    def checked: Boolean = js.native
    def indeterminate: Boolean = js.native
    def value: String = js.native
  }

  @js.native
  @JSImport("@material/web/checkbox/checkbox.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement

  /** Whether or not the checkbox is selected. */
  lazy val checked: HtmlAttr[Boolean] =
    htmlAttr("checked", BooleanAsAttrPresenceCodec)

  /** Whether or not the checkbox is indeterminate (neither checked nor
    * unchecked).
    * @see
    *   [[https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#indeterminate_state_checkboxes]]
    */
  lazy val indeterminate: HtmlAttr[Boolean] =
    htmlAttr("indeterminate", BooleanAsAttrPresenceCodec)

  /** When true, require the checkbox to be selected when participating in form
    * submission.
    * @see
    *   [[https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#validation]]
    */
  lazy val required: HtmlAttr[Boolean] =
    htmlAttr("required", BooleanAsAttrPresenceCodec)

  /** The value of the checkbox that is submitted with a form when selected
    * (defaults to 'on').
    * @see
    *   [[https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/checkbox#value]]
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** The name of the checkbox, used when submitting a form. */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  /** Whether or not the checkbox is disabled. */
  lazy val disabled: HtmlAttr[Boolean] =
    htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  object events {
    val change: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("change")
    val input: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("input")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-checkbox")
}
