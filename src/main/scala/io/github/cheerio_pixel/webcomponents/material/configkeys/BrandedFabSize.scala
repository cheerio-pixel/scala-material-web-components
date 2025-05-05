package io.github.cheerio_pixel.webcomponents.material.configkeys

sealed trait BrandedFabSize {
  def value: String = toString
}

object BrandedFabSize extends EnumerationString[BrandedFabSize] {

  case object Medium extends BrandedFabSize
  case object Large  extends BrandedFabSize

  override def valueOf(value: BrandedFabSize): String = value.value

  override val allValues: List[BrandedFabSize] = List(Medium, Large)

}



