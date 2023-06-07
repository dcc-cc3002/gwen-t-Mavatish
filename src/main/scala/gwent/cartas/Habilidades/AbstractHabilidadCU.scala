package cl.uchile.dcc
package gwent.cartas.Habilidades

import java.util.Objects

/***
 *  * Clase abstracta para las habilidades de cartas Unidad
 * @param nombreHabilidad
 * El metodo aplicar permite aplicar la habilidad a las cartas clima
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
abstract class AbstractHabilidadCU (val nombreHabilidad: String ) {
  def aplicar() : Unit
  
  override def hashCode(): Int={
    Objects.hash(
      classOf[AbstractHabilidadCU], nombreHabilidad)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[AbstractHabilidadCU]) {
      val other = obj.asInstanceOf[AbstractHabilidadCU]
      (this eq other) ||
        other.nombreHabilidad == nombreHabilidad
    } else {
      false
    }
  }
}
