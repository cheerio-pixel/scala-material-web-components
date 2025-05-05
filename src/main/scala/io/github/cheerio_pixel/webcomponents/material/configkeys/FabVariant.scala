package io.github.cheerio_pixel.webcomponents.material.configkeys

sealed trait FabVariant {
  def value: String = toString
}

object FabVariant extends EnumerationString[FabVariant] {

  case object Surface extends FabVariant
  case object Primary extends FabVariant
  case object Secondary extends FabVariant
  case object Tertiary  extends FabVariant

  override def valueOf(value: FabVariant): String = value.value

  override val allValues: List[FabVariant] = List(Surface, Primary, Secondary, Tertiary)

}




