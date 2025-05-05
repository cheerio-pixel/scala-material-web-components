package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-slider component
  
  */
object Slider extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/slider/slider.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val min: HtmlAttr[Double] = htmlAttr("min", DoubleAsStringCodec)
  lazy val max: HtmlAttr[Double] = htmlAttr("max", DoubleAsStringCodec)
  lazy val value: HtmlAttr[String] = htmlAttr("value", StringAsIsCodec)
  lazy val valueStart: HtmlAttr[String] = htmlAttr("value-start", StringAsIsCodec)
  lazy val valueEnd: HtmlAttr[String] = htmlAttr("value-end", StringAsIsCodec)
  lazy val valueLabel: HtmlAttr[String] = htmlAttr("value-label", StringAsIsCodec)
  lazy val valueLabelStart: HtmlAttr[String] = htmlAttr("value-label-start", StringAsIsCodec)
  lazy val valueLabelEnd: HtmlAttr[String] = htmlAttr("value-label-end", StringAsIsCodec)
  lazy val ariaLabelStart: HtmlAttr[String] = htmlAttr("aria-label-start", StringAsIsCodec)
  lazy val ariaValuetextStart: HtmlAttr[String] = htmlAttr("aria-valuetext-start", StringAsIsCodec)
  lazy val ariaLabelEnd: HtmlAttr[String] = htmlAttr("aria-label-end", StringAsIsCodec)
  lazy val ariaValuetextEnd: HtmlAttr[String] = htmlAttr("aria-valuetext-end", StringAsIsCodec)
  lazy val step: HtmlAttr[Double] = htmlAttr("step", DoubleAsStringCodec)
  lazy val ticks: HtmlAttr[Boolean] = htmlAttr("ticks", BooleanAsAttrPresenceCodec)
  lazy val labeled: HtmlAttr[Boolean] = htmlAttr("labeled", BooleanAsAttrPresenceCodec)
  lazy val range: HtmlAttr[Boolean] = htmlAttr("range", BooleanAsAttrPresenceCodec)
  lazy val name: HtmlAttr[String] = htmlAttr("name", StringAsIsCodec)
  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  object events {
    val change: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("change")
    val input: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("input")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-slider")
}
