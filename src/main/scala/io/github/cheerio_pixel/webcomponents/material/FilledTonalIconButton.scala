package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent
import io.github.cheerio_pixel.webcomponents.material.configkeys.ButtonType

/** md-filled-tonal-icon-button component
  
  */
object FilledTonalIconButton extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/iconbutton/filled-tonal-icon-button.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  /** Disables the icon button and makes it non-interactive. */
  lazy val disabled: HtmlAttr[Boolean] =
    htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Soft disables the icon button (visual disabled state but remains
    * interactive).
    */
  lazy val softDisabled: HtmlAttr[Boolean] =
    htmlAttr("soft-disabled", BooleanAsAttrPresenceCodec)

  /** Flips the icon if it is in an RTL context at startup. */
  lazy val flipIconInRtl: HtmlAttr[Boolean] =
    htmlAttr("flip-icon-in-rtl", BooleanAsAttrPresenceCodec)

  /** Sets the underlying HTMLAnchorElement's href resource attribute. */
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)

  /** Sets the download attribute for the anchor element (when used as a link).
    */
  lazy val download: HtmlAttr[String] = htmlAttr("download", StringAsIsCodec)

  /** Sets the underlying HTMLAnchorElement's target attribute. */
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)

  /** The aria-label of the button when the button is toggleable and selected.
    */
  lazy val ariaLabelSelected: HtmlAttr[String] =
    htmlAttr("aria-label-selected", StringAsIsCodec)

  /** When true, the button will toggle between selected and unselected states.
    */
  lazy val toggle: HtmlAttr[Boolean] =
    htmlAttr("toggle", BooleanAsAttrPresenceCodec)

  /** Sets the selected state. When false, displays the default icon. When true,
    * displays the selected icon, or the default icon if no slot="selected" icon
    * is provided.
    */
  lazy val selected: HtmlAttr[Boolean] =
    htmlAttr("selected", BooleanAsAttrPresenceCodec)

  /** The default behavior of the button. May be "button", "reset", or "submit".
    */
  lazy val `type`: HtmlAttr[ButtonType] =
    htmlAttr("type", ButtonType.AsStringCodec)

  /** Alternative name for `type` attribute. */
  lazy val tpe: HtmlAttr[ButtonType] =
    htmlAttr("type", ButtonType.AsStringCodec)

  /** Alternative name for `type` attribute. */
  lazy val typ: HtmlAttr[ButtonType] =
    htmlAttr("type", ButtonType.AsStringCodec)

  /** The value added to a form with the button's name when the button submits a
    * form.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  object events {
    val input: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("input")
    val change: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("change")
  }

  object slots {
    val icon = Slot("icon")
  }


  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-filled-tonal-icon-button")
}
