package cl.uchile.dcc
package gwent.cartas.cartasUnidad

import gwent.cartas.ComunCartas

import gwent.cartas.Habilidades.AbstractHabilidadCU

import java.util.Objects

/***
 * Clase abstacta con interfaz en ComunCartas, que aplica 3 atributos que tienen todas las carta clima
 * Hereda de ComunCartas
 * @param nombrecu
 * @param habilidad
 * @param fuerza
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
abstract class AbstractCU (private val nombrecu: String, private val habilidad: String, private var fuerza: Int) extends AbstractHabilidadCU(habilidad) with ComunCartas {
  def getnombre = {nombrecu}
  def getfuerza =  {fuerza}
  def gethabilidad = {habilidad}

  override def hashCode():  Int={
    Objects.hash(
      classOf[AbstractCU], nombrecu, habilidad, fuerza)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[AbstractCU]) {
      val other = obj.asInstanceOf[AbstractCU]
      (this eq other) ||
        other.getnombre == nombrecu &&
          other.gethabilidad == habilidad &&
          other.getfuerza == fuerza
    } else {
      false
    }
  }
}
