package cl.uchile.dcc
package gwent.tablero.zonas
import gwent.cartas.cartasUnidad.ADistancia

import java.util.Objects
import scala.collection.mutable.ListBuffer

/***
 * Clase ZonaAdistancia determina la Zona del tablero donde se situan las cartas de la zona distancia
 * El metodo agregar permite poner cartas de tipo A distancia en el tablero
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */

class ZonaADistancia {
 private var CartaD = List.empty[ADistancia]

  def agregar (carta: ADistancia)= {
    CartaD = CartaD :+ carta
  }
  override def hashCode(): Int = {
    Objects.hash(
      classOf[ZonaADistancia])
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[ZonaADistancia]) {
      val other = obj.asInstanceOf[ZonaADistancia]
      (this eq other) 
    } else {
      false
    }
  }
}
