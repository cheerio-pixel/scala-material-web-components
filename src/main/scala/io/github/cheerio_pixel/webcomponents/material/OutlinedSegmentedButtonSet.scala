package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-outlined-segmented-button-set component
   * MdOutlinedSegmentedButtonSet is the custom element for the Material
Design outlined segmented button set component.
  */
object OutlinedSegmentedButtonSet extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/labs/segmentedbuttonset/outlined-segmented-button-set.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val multiselect: HtmlAttr[Boolean] = htmlAttr("multiselect", BooleanAsAttrPresenceCodec)

  object events {
    val segmentedButtonSetSelection: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("segmented-button-set-selection")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-outlined-segmented-button-set")
}
