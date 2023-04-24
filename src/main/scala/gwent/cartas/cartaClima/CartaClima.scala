package cl.uchile.dcc
package gwent.cartas.cartaClima

import gwent.cartas.ComunCartas

import java.util.Objects

/**
 * Esta clase reepresentara las cartas de Clima junto a su efecto
 *
 * @param nombrecc
 * @param efecto
 */
class CartaClima(private val nombrecc: String, private val habilidad: String) extends ComunCartas {
  def getnombrecc() = nombrecc

  override def darHabilidad(): String = {
    habilidad
  }

  override def hashCode(): Int = {
    Objects.hash(
      classOf[CartaClima], nombrecc, habilidad)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[CartaClima]) {
      val other = obj.asInstanceOf[CartaClima]
      (this eq other) ||
        other.nombrecc == nombrecc &&
          other.habilidad == habilidad
    } else {
      false
    }
  }
}