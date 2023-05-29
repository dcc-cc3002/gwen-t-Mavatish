package cl.uchile.dcc
package gwent.cartas.cartasUnidad

import cl.uchile.dcc.gwent.cartas.Habilidades.AbstractHabilidadCU
import cl.uchile.dcc.gwent.tablero.{Tablero, TableroJugador}

import java.util.Objects

/***
 * * Esta clase reepresentara las cartas de Unidad de tipo Asedio junto a sus 3 caracteristicas
 * Esta clase hereda desde AbstractCU
 * @param nombrecu
 * @param habilidad
 * @param fuerza
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
class Asedio (nombrecu: String, habilidad: AbstractHabilidadCU, fuerza: Int ) extends AbstractCU (nombrecu, habilidad, fuerza) {

  override def aplicarHabilidad(): Unit = habilidad.aplicar()
  override def ponerCarta(tablero: TableroJugador): Unit = {
    tablero.ponerCartaAsedio(this)
  }
    
  override def hashCode(): Int={
    Objects.hash(
      classOf[Asedio], nombrecu, habilidad, fuerza)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[Asedio]) {
      val other = obj.asInstanceOf[Asedio]
      (this eq other) ||
        other.nombrecu == nombrecu &&
          other.habilidad == habilidad &&
          other.fuerza == fuerza
    } else {
      false
    }
  }
}

