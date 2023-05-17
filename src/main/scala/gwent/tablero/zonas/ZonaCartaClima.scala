package cl.uchile.dcc
package gwent.tablero.zonas

import gwent.cartas.cartaClima.CartaClima

import java.util.Objects
import scala.collection.mutable.ListBuffer

class ZonaCartaClima {
  var CartaC = ListBuffer.empty[CartaClima]

  override def hashCode(): Int = {
    Objects.hash(
      classOf[ZonaCartaClima])
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[ZonaCartaClima]) {
      val other = obj.asInstanceOf[ZonaCartaClima]
      (this eq other)
    } else {
      false
    }
  }
}
