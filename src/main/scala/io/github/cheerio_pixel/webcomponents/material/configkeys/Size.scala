package io.github.cheerio_pixel.webcomponents.material.configkeys

sealed trait Size {
  def value: String = toString
}

object Size extends EnumerationString[Size] {

  case object Small extends Size
  case object Medium extends Size
  case object Large  extends Size

  override def valueOf(value: Size): String = value.value

  override val allValues: List[Size] = List(Small, Medium, Large)

}


