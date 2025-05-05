package io.github.cheerio_pixel.webcomponents.material.configkeys

sealed trait ButtonType {
  def value: String = toString
}

object ButtonType extends EnumerationString[ButtonType] {

  case object Button extends ButtonType
  case object Submit extends ButtonType
  case object Reset  extends ButtonType

  override def valueOf(value: ButtonType): String = value.value

  override val allValues: List[ButtonType] = List(Button, Submit, Reset)

}

