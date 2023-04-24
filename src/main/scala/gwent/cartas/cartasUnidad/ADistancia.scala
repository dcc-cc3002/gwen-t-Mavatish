package cl.uchile.dcc
package gwent.cartas.cartasUnidad

import java.util.Objects

/***
 * Esta clase reepresentara las cartas de Unidad de tipo Adistancia junto a sus 3 caracteristicas
 * Esta clase hereda desde AbstractCU
 * @param nombrecu
 * @param habilidad
 * @param fuerza
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */

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
