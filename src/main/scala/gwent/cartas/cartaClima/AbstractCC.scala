package cl.uchile.dcc
package gwent.cartas.cartaClima

import gwent.cartas.ComunCartas

import java.util.Objects

abstract class AbstractCC(private val nombrecc: String, private var habilidad: String) extends ComunCartas {
  def getnombre = {
    nombrecc
  }

  def gethabilidad = {
    habilidad
  }

  override def hashCode(): Int ={
    Objects.hash(
      classOf[AbstractCC], nombrecc, habilidad)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[AbstractCC]) {
      val other = obj.asInstanceOf[AbstractCC]
      (this eq other) ||
        other.getnombre == nombrecc &&
          other.gethabilidad == habilidad 
    } else {
      false
    }
  }
}
