package cl.uchile.dcc
package gwent.tablero
import gwent.tablero.zonas.ZonaADistancia
import gwent.tablero.zonas.ZonaAsedio
import gwent.tablero.zonas.ZonaCuerpoACuerpo

import cl.uchile.dcc.gwent.cartas.cartaClima.CartaClima
import gwent.cartas.cartasUnidad.ADistancia
import gwent.cartas.cartasUnidad.Asedio
import gwent.cartas.cartasUnidad.CuerpoACuerpo

import java.util.Objects
import gwent.tablero.Tablero

import cl.uchile.dcc.gwent.Jugador
import cl.uchile.dcc.gwent.cartas.ComunCartas

/***
 * La clase tablero Jugador define el secctor del tablero donde cada jugador puede poner sus cartas
 * @param jugador
 * El metodo iniciar permite acceder al tablero general y poder poner las cartas
 * El metodo ponerCartaClima permite poner las cartas de este tipo en el tablero
 * El metodo ponerCarta permite poner las cartas en el tablero
 * El metodo ponerCartaDistancia permite poner las cartas de este tipo en el tablero
 * El metodo ponerCartaAsedio permite poner las cartas de este tipo en el tablero
 * El metodo ponerCartaACuerpo permite poner las cartas de este tipo en el tablero
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
class TableroJugador (jugador: Jugador) {
  private var zonaDistancia: ZonaADistancia = new ZonaADistancia
  private var zonaAsedio: ZonaAsedio = new ZonaAsedio
  private var zonaACuerpo : ZonaCuerpoACuerpo = new ZonaCuerpoACuerpo
  private var TableroAsociado: Tablero = _
  
  def iniciar( tablero: Tablero): Unit ={
    TableroAsociado = tablero
  }
  def ponerCartaClima(cartaClima: CartaClima): Unit ={
    TableroAsociado.ponerCartaClima(cartaClima)
  }
  
  def ponerCarta(carta: ComunCartas): Unit = {
    carta.ponerCarta(this)
  }
  def ponerCartaDistancia(cartaDistacia: ADistancia): Unit = {
    zonaDistancia.agregar(cartaDistacia)
  }

  def ponerCartaAsedio(cartaAsedio: Asedio): Unit = {
    zonaAsedio.agregar(cartaAsedio)
  }

  def ponerCartaACuerpo(cartaACuerpo: CuerpoACuerpo): Unit = {
    zonaACuerpo.agregar(cartaACuerpo)
  }

  def actualizarADistacia( adistancia: ADistancia): Unit={
    adistancia.aplicarHabilidad()
  }

  def actualizarAsedio(asedio: Asedio): Unit = {
    asedio.aplicarHabilidad()
  }

  def actualizarCuerpoACuerpo(cuerpoACuerpo: CuerpoACuerpo): Unit = {
    cuerpoACuerpo.aplicarHabilidad()
  }
  
  def actualizarCClima(cartaClima: CartaClima): Unit={
    TableroAsociado.ponerCartaClima(cartaClima)
    cartaClima.aplicarHabilidad()
  }
  
  override def hashCode(): Int = {
    Objects.hash(
      classOf[TableroJugador])
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[TableroJugador]) {
      val other = obj.asInstanceOf[TableroJugador]
      (this eq other)
    } else {
      false
    }
  }
}
