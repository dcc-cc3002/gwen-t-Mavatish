package cl.uchile.dcc
package gwent.cartas.cartaClima

import gwent.cartas.ComunCartas

import cl.uchile.dcc.gwent.tablero.Tablero

import java.util.Objects
import gwent.tablero.zonas.ZonaCartaClima

/**
 * Esta clase reepresentara las cartas de Clima junto a su Habilidad, esta clase hereda desde AbstractCC
 * @param nombrecc
 * @param efecto
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
class CartaClima(private val nombrecc: String, private val habilidad: String) extends AbstractCC(nombrecc, habilidad) {

  override def darHabilidad(): String = {
    habilidad
  }

  override def ponerCarta(tablero: Tablero): Unit={
    tablero.ponerCartaClima(this)
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