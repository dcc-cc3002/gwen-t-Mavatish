package cl.uchile.dcc
package gwent.cartas.cartasUnidad

import gwent.cartas.ComunCartas

import java.util.Objects

abstract class AbstractCU (private val nombrecu: String, private val habilidad: String, private var fuerza: Int) extends ComunCartas{
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
