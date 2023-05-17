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

class Tablero (val Jugador1: Jugador, val Jugador2 : Jugador, val TableroJugador1 : TableroJugador, val TableroJugador2 : TableroJugador) {
  protected var JCC: ZonaCartaClima = new ZonaCartaClima
  def ponerCartas (carta: ComunCartas): Unit = {
    carta.ponerCarta(this)
  }
  def ponerCartaClima(cartaClima: CartaClima): Unit = {
    JCC.CartaC(0) = cartaClima
  }

  override def hashCode(): Int = {
    Objects.hash(
      classOf[Tablero], Jugador1, Jugador2, TableroJugador1, TableroJugador2)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[Tablero]) {
      val other = obj.asInstanceOf[Tablero]
      (this eq other) ||
        other.Jugador1 == Jugador1 &&
          other.Jugador2 == Jugador2 &&
          other.TableroJugador1 == TableroJugador1 &&
          other.TableroJugador2 == TableroJugador2
    } else {
      false
    }

  }
}