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

abstract class AbstractChip extends WebComponent {

  /** Whether the chip is disabled. Disabled chips are not focusable unless
    * `alwaysFocusable` is set.
    */
  lazy val disabled: HtmlAttr[Boolean] =
    htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  /** When true, allow disabled chips to be focused with arrow keys (for
    * increased visibility when disabled).
    * @see
    *   [[https://www.w3.org/WAI/ARIA/apg/practices/keyboard-interface/#kbd_disabled_controls]]
    */
  lazy val alwaysFocusable: HtmlAttr[Boolean] =
    htmlAttr("always-focusable", BooleanAsAttrPresenceCodec)

  /** The visible label text of the chip. */
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)

  /** Only needed for SSR - indicates the chip has an icon slot to avoid FOUC.
    */
  lazy val hasIcon: HtmlAttr[Boolean] =
    htmlAttr("has-icon", BooleanAsAttrPresenceCodec)
}
