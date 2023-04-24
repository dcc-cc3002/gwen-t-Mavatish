package cl.uchile.dcc
package gwent.cartas.cartasUnidad

import java.util.Objects

class Asedio (nombrecu: String, habilidad: String, fuerza: Int ) extends AbstractCU (nombrecu, habilidad, fuerza) {
  override def darHabilidad(): String = {
    habilidad
  }

  override def hashCode(): Int={
    Objects.hash(
      classOf[Asedio], nombrecu, habilidad, fuerza)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[Asedio]) {
      val other = obj.asInstanceOf[Asedio]
      (this eq other) ||
        other.getnombre == nombrecu &&
          other.gethabilidad == habilidad &&
          other.getfuerza == fuerza
    } else {
      false
    }
  }
}

