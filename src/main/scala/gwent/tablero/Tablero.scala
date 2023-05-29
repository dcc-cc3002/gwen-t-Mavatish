package cl.uchile.dcc
package gwent.tablero

import gwent.Jugador
import gwent.tablero.zonas.ZonaADistancia
import gwent.tablero.zonas.ZonaAsedio
import gwent.tablero.zonas.ZonaCuerpoACuerpo
import gwent.tablero.zonas.ZonaCartaClima
import gwent.cartas.cartaClima.CartaClima

import cl.uchile.dcc.gwent.cartas.ComunCartas
import gwent.tablero.TableroJugador

import java.util.Objects
/***
 * La clase tablero define el tablero de juego
 * @param TableroJugador2
 * @param TableroJugador1
 * El metodo ponerCartaClima permite poner las cartas clima en un espacio m ixto donde ambos jugadores pueden acceder
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
class Tablero (val TableroJugador1 : TableroJugador, val TableroJugador2 : TableroJugador) {
  protected var JCC: ZonaCartaClima = new ZonaCartaClima
 
  def ponerCartaClima(cartaClima: CartaClima): Unit = {
    JCC.agregar(cartaClima)
  }

  override def hashCode(): Int = {
    Objects.hash(
      classOf[Tablero], TableroJugador1, TableroJugador2)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[Tablero]) {
      val other = obj.asInstanceOf[Tablero]
      (this eq other) ||
          other.TableroJugador1 == TableroJugador1 &&
          other.TableroJugador2 == TableroJugador2
    } else {
      false
    }

  }
}