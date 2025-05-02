package com.cheerio_pixel.webcomponents.material

import com.cheerio_pixel.webcomponents.WebComponent

import com.raquo.laminar.api.L.*
import org.scalajs.dom
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import com.raquo.laminar.tags.CustomHtmlTag
import com.raquo.laminar.codecs.{BooleanAsAttrPresenceCodec, StringAsIsCodec}

object ElevatedButton extends WebComponent {
  @js.native
    trait RawElement extends js.Object

  @js.native
  @JSImport("@material/web/button/elevated-button.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement

  lazy val disabled: HtmlAttr[Boolean] = htmlAttr("disabled", BooleanAsAttrPresenceCodec)

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-elevated-button")

  object slots {}
  object events {
  }

}