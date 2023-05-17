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

class TableroJugador {
  protected var zonaDistancia: ZonaADistancia = new ZonaADistancia
  protected var zonaAsedio: ZonaAsedio = new ZonaAsedio
  protected var zonaACuerpo : ZonaCuerpoACuerpo = new ZonaCuerpoACuerpo
  protected var TableroAsociado: Tablero = _
  
  def iniciar( tablero: Tablero): Unit ={
    TableroAsociado = tablero
  }
  def ponerCartaClima(cartaClima: CartaClima): Unit ={
    TableroAsociado.ponerCartaClima(cartaClima)
  }
  def ponerCartaDistancia(cartaDistacia: ADistancia): Unit = {
    zonaDistancia.CartaD += cartaDistacia
  }

  def ponerCartaAsedio(cartaAsedio: Asedio): Unit = {
    zonaAsedio.CartaA += cartaAsedio
  }

  def ponerCartaACuerpo(cartaACuerpo: CuerpoACuerpo): Unit = {
    zonaACuerpo.CartaCC += cartaACuerpo
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
