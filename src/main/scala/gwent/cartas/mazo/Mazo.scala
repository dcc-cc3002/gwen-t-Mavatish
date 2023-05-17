package cl.uchile.dcc
package gwent.cartas.mazo

import gwent.cartas.ComunCartas

import java.util.Objects
import scala.util.Random

class Mazo(private var lista: List[ComunCartas]) {
  def addcarta(comunCartas: ComunCartas): Unit = {
    lista = lista :+ comunCartas

  }

  def mostrarCartas(): Unit = {
    for (e <- lista) {
      println(e.toString)
    }
  }

  def robarCarta(comunCartas: ComunCartas): ComunCartas = {
    var carta = lista.last
    lista = lista.init
    carta
  }

  def barajar(): Unit = {
    Random.shuffle(lista)
  }

  override def hashCode(): Int = {
    Objects.hash(
      classOf[Mazo], lista)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[Mazo]) {
      val other = obj.asInstanceOf[Mazo]
      (this eq other) ||
        other.lista == lista
    } else {
      false
    }
  }
}
