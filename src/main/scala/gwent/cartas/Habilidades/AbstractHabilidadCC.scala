package cl.uchile.dcc
package gwent.cartas.Habilidades

import java.util.Objects

/***
 * Clase abstracta para las habilidades de cartas clima 
 * @param nombreHabilidad
 * El metodo aplicar permite aplicar la habilidad a las cartas clima
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */

abstract class AbstractHabilidadCC (val nombreHabilidad: String) {
  def aplicar(): Unit
  
  override def hashCode(): Int={
    Objects.hash(
      classOf[AbstractHabilidadCC], nombreHabilidad)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[AbstractHabilidadCC]) {
      val other = obj.asInstanceOf[AbstractHabilidadCC]
      (this eq other) ||
        other.nombreHabilidad == nombreHabilidad
    } else {
      false
    }
  }
}
