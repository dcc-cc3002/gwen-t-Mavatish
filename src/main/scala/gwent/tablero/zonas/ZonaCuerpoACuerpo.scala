package cl.uchile.dcc
package gwent.tablero.zonas

import scala.collection.mutable.ListBuffer
import gwent.cartas.cartasUnidad.CuerpoACuerpo

import java.util.Objects

/***
 * Clase ZonaCuerpoACuerpo determina la Zona del tablero donde se situan las cartas de la zona Cuerpo a Cuerpo
 * El metodo agregar permite poner cartas de tipo cuerpo a cuerpo en el tablero
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */

class ZonaCuerpoACuerpo {
  private var CartaCC = ListBuffer.empty[CuerpoACuerpo]

  def agregar(carta: CuerpoACuerpo) = {
    CartaCC = CartaCC :+ carta
  }
  override def hashCode(): Int = {
    Objects.hash(
      classOf[ZonaCuerpoACuerpo])
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[ZonaCuerpoACuerpo]) {
      val other = obj.asInstanceOf[ZonaCuerpoACuerpo]
      (this eq other)
    } else {
      false
    }
  }
}

