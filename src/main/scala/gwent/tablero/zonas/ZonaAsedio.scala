package cl.uchile.dcc
package gwent.tablero.zonas

import scala.collection.mutable.ListBuffer
import gwent.cartas.cartasUnidad.Asedio

import java.util.Objects

class ZonaAsedio {
  var CartaA = ListBuffer.empty[Asedio]

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

