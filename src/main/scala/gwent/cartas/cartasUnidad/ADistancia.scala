package cl.uchile.dcc
package gwent.cartas.cartasUnidad

import java.util.Objects

class ADistancia (nombrecu: String, habilidad: String, fuerza: Int ) extends AbstractCU (nombrecu, habilidad, fuerza) {
  override def darHabilidad(): String = {
    habilidad
  }

  override def hashCode(): Int = {
    Objects.hash(
      classOf[ADistancia], nombrecu, habilidad, fuerza)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[ADistancia]) {
      val other = obj.asInstanceOf[ADistancia]
      (this eq other) ||
        other.getnombre == nombrecu &&
          other.gethabilidad == habilidad &&
          other.getfuerza == fuerza
    } else {
      false
    }
  }
}
