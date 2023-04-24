package cl.uchile.dcc
package gwent.cartas.Habilidades

import java.util.Objects

abstract class AbstractHabilidadCC (private val nombre: String){
  override def hashCode(): Int={
    Objects.hash(
      classOf[AbstractHabilidadCC], nombre)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[AbstractHabilidadCC]) {
      val other = obj.asInstanceOf[AbstractHabilidadCC]
      (this eq other) ||
        other.nombre == nombre
    } else {
      false
    }
  }
}
