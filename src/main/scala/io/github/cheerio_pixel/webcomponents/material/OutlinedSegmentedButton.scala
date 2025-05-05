package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-outlined-segmented-button component
   * MdOutlinedSegmentedButton is the custom element for the Material
Design outlined segmented button component.
  */
object OutlinedSegmentedButton extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/labs/segmentedbutton/outlined-segmented-button.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)
  lazy val selected: HtmlAttr[Boolean] = htmlAttr("selected", BooleanAsAttrPresenceCodec)
  lazy val label: HtmlAttr[String] = htmlAttr("label", StringAsIsCodec)
  lazy val noCheckmark: HtmlAttr[Boolean] = htmlAttr("no-checkmark", BooleanAsAttrPresenceCodec)
  lazy val hasIcon: HtmlAttr[Boolean] = htmlAttr("has-icon", BooleanAsAttrPresenceCodec)

  object events {
    val segmentedButtonInteraction: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("segmented-button-interaction")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-outlined-segmented-button")
}
