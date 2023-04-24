package cl.uchile.dcc
package gwent.cartas.Habilidades

import java.util.Objects

abstract class AbstractHabilidadCU (private val nombre: String) {
  override def hashCode(): Int={
    Objects.hash(
      classOf[AbstractHabilidadCU], nombre)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[AbstractHabilidadCU]) {
      val other = obj.asInstanceOf[AbstractHabilidadCU]
      (this eq other) ||
        other.nombre == nombre
    } else {
      false
    }
  }
}
