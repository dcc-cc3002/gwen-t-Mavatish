package cl.uchile.dcc
package gwent

import gwent.cartas.mazo.Mazo

import cl.uchile.dcc.gwent.cartas.ComunCartas
import java.util.Objects

/***

 * Esta clase represetara al jugador junto a las caracteristicas que este debe tener
 * @param nombre
 * @param contador
 * esta variable se utilizara para contar las gemas, lo cual representa a las vidas del jugador
 * @param mazo
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
class Jugador (private val nombre: String, private var contador: Int, private var mazo: Mazo) {
  def getnombre() = nombre
  def getcontador() = contador

  private var mano = new Mazo(List.empty[ComunCartas])

  override def hashCode(): Int= {
    Objects.hash(
      classOf[Jugador], nombre,  contador)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[Jugador]) {
      val other = obj.asInstanceOf[Jugador]
      (this eq other) ||
        other.getnombre() == nombre &&
          other.getcontador() == contador
    } else {
      false
    }
  }
}
