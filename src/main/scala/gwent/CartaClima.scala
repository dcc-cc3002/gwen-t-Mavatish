package cl.uchile.dcc
package gwent

/**
 * Esta clase reepresentara las cartas de Clima junto a su efecto
 * @param nombrecc
 * @param efecto
 */
class CartaClima(private val nombrecc: String, private val efecto: String) {
  def getnombrecc() = nombrecc
  def getefecto() = efecto
}
