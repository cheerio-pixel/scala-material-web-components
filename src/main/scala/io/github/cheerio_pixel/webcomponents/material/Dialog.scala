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

/** Dialogs provide important prompts in a user flow.
  *
  * @see
  *   <a href="https://material-web.dev/components/dialog/">the doc</a> for more
  *   information.
  */
object Dialog extends WebComponent {
  @js.native
  trait RawElement extends js.Object {
    def returnValue: String = js.native
  }

  @js.native
  @JSImport("@material/web/dialog/dialog.js", JSImport.Default)
  object RawImport extends js.Object

  used(RawImport)

  type Ref = dom.html.Element & RawElement

  /** Whether the dialog is currently open and visible to the user. */
  lazy val open: HtmlAttr[Boolean] =
    htmlAttr("open", BooleanAsAttrPresenceCodec)

  /** Skips the opening and closing animations when set to true. */
  lazy val quick: HtmlAttr[Boolean] =
    htmlAttr("quick", BooleanAsAttrPresenceCodec)

  /** The type of dialog for accessibility. Set to "alert" to announce as an
    * alert dialog.
    */
  lazy val `type`: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)

  /** The type of dialog for accessibility (alias for `type`). */
  lazy val tpe: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)

  /** The type of dialog for accessibility (alias for `type`). */
  lazy val typ: HtmlAttr[String] = htmlAttr("type", StringAsIsCodec)

  /** Disables focus trapping when true (not recommended for accessibility). By
    * default, focus is trapped within the dialog during keyboard navigation.
    * When disabled, focus can escape to browser chrome after last element.
    */
  lazy val noFocusTrap: HtmlAttr[Boolean] =
    htmlAttr("no-focus-trap", BooleanAsAttrPresenceCodec)

  /** The dialog's return value, typically indicating which button closed it.
    * @see
    *   [[https://developer.mozilla.org/en-US/docs/Web/API/HTMLDialogElement/returnValue]]
    */
  lazy val returnValue: HtmlAttr[String] =
    htmlAttr("returnValue", StringAsIsCodec)

  object events {

    /** Dispatched when the dialog begins opening (before animations start). */
    val open: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("open")

    /** Dispatched when the dialog has finished opening (after animations
      * complete).
      */
    val opened: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("opened")

    /** Dispatched when the dialog begins closing (before animations start). */
    val close: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("close")

    /** Dispatched when the dialog has finished closing (after animations
      * complete).
      */
    val closed: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("closed")

    /** Dispatched when the dialog is canceled (via scrim click or Escape key).
      */
    val cancel: EventProp[EventWithPreciseTarget[Ref]] = new EventProp("cancel")

  }

  object slots {
    val headline = Slot("headline")
    val content = Slot("content")
    val actions = Slot("actions")
  }

  protected val tag: CustomHtmlTag[Ref] = CustomHtmlTag("md-dialog")
}
