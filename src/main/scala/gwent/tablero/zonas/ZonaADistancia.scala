package cl.uchile.dcc
package gwent.tablero.zonas
import gwent.cartas.cartasUnidad.ADistancia

import java.util.Objects
import scala.collection.mutable.ListBuffer

class ZonaADistancia {
  var CartaD = ListBuffer.empty[ADistancia]

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
