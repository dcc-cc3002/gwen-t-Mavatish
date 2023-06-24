package cl.uchile.dcc
package gwent.tablero.zonas

import scala.collection.mutable.ListBuffer
import gwent.cartas.cartasUnidad.Asedio

import java.util.Objects

/***
 * Clase ZonaAdistancia determina la Zona del tablero donde se situan las cartas de la zona asedio
 * El metodo agregar permite poner cartas de tipo asedio en el tablero
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
class ZonaAsedio {
  private var CartaA = List.empty[Asedio]

  def agregar(carta: Asedio) = {
    CartaA = CartaA :+ carta
  }

  override def hashCode(): Int = {
    Objects.hash(
      classOf[ZonaAsedio])
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[ZonaAsedio]) {
      val other = obj.asInstanceOf[ZonaAsedio]
      (this eq other)
    } else {
      false
    }
  }
}

