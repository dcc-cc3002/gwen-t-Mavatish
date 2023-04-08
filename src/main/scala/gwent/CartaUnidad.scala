package cl.uchile.dcc
package gwent

/**
 * Esta clase representara a las cartas de tipo Unidad, junto a todas las caracteristicas que ellas poseen 
 * @param nombrecu
 * @param clasificacion
 * @param valor
 * @param habilidad
 */
class CartaUnidad( private val nombrecu: String, private val clasificacion: String, private val valor: Int, private val habilidad: String ) {
  def getnombrecu() = nombrecu
  def getclasificacion() = clasificacion
  def getvalor() = valor
  def gethabilidad() = habilidad 
}
