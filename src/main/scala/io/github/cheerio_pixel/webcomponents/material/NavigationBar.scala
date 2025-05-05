package io.github.cheerio_pixel.webcomponents.material

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec, DoubleAsStringCodec}
import io.github.cheerio_pixel.webcomponents.material.eventtypes.EventWithPreciseTarget
import io.github.cheerio_pixel.webcomponents.WebComponent

/** md-navigation-bar component
  
  */
object NavigationBar extends WebComponent {
  @js.native
  trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/labs/navigationbar/navigation-bar.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement
  lazy val activeIndex: HtmlAttr[Double] = htmlAttr("active-index", DoubleAsStringCodec)
  lazy val hideInactiveLabels: HtmlAttr[Boolean] = htmlAttr("hide-inactive-labels", BooleanAsAttrPresenceCodec)

  object events {
    val navigationBarActivated: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("navigation-bar-activated")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-navigation-bar")
}
