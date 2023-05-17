package cl.uchile.dcc
package gwent.tablero.zonas

import scala.collection.mutable.ListBuffer
import gwent.cartas.cartasUnidad.CuerpoACuerpo

import java.util.Objects

class ZonaCuerpoACuerpo {
  var CartaCC = ListBuffer.empty[CuerpoACuerpo]

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

