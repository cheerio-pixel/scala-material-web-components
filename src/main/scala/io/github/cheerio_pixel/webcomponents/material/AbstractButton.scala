package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.keys.HtmlAttr
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec}
import com.raquo.laminar.api.L.*
import io.github.cheerio_pixel.webcomponents.material.configkeys.ButtonType
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

abstract class AbstractButton extends WebComponent {

  /** Whether or not the button is disabled. */
  lazy val disabled: HtmlAttr[Boolean] =
    htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** Whether the button is "soft-disabled" (disabled but still focusable). */
  lazy val softDisabled: HtmlAttr[Boolean] =
    htmlAttr("soft-disabled", BooleanAsAttrPresenceCodec)

  /** The URL that the link button points to. */
  lazy val href: HtmlAttr[String] = htmlAttr("href", StringAsIsCodec)

  /** Where to display the linked href URL for a link button. Common options
    * include _blank to open in a new tab.
    */
  lazy val target: HtmlAttr[String] = htmlAttr("target", StringAsIsCodec)

  /** Whether to render the icon at the inline end of the label rather than the
    * inline start. Note: Link buttons cannot have trailing icons.
    */
  lazy val trailingIcon: HtmlAttr[Boolean] =
    htmlAttr("trailing-icon", BooleanAsAttrPresenceCodec)

  /** Whether to display the icon or not. */
  lazy val hasIcon: HtmlAttr[Boolean] =
    htmlAttr("has-icon", BooleanAsAttrPresenceCodec)

  /** The default behavior of the button. May be "button", "reset", or "submit"
    * (default).
    */
  lazy val `type`: HtmlAttr[ButtonType] =
    htmlAttr("type", ButtonType.AsStringCodec)

  /** The default behavior of the button. May be "button", "reset", or "submit"
    * (default).
    */
  lazy val tpe: HtmlAttr[ButtonType] =
    htmlAttr("type", ButtonType.AsStringCodec)

  /** The default behavior of the button. May be "button", "reset", or "submit"
    * (default).
    */
  lazy val typ: HtmlAttr[ButtonType] =
    htmlAttr("type", ButtonType.AsStringCodec)

  /** The value added to a form with the button's name when the button submits a
    * form.
    */
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)

  /** The name of the button, used when submitting a form. */
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)

  object slots {
    val icon = Slot("icon")
  }
  object events {
    val onClick: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("click")
  }
}
