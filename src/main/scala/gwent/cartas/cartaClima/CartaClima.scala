package cl.uchile.dcc
package gwent.cartas.cartaClima

import gwent.cartas.ComunCartas

import cl.uchile.dcc.gwent.tablero.{Tablero, TableroJugador}

import java.util.Objects
import gwent.tablero.zonas.ZonaCartaClima

import cl.uchile.dcc.gwent.cartas.Habilidades.AbstractHabilidadCC

/**
 * Esta clase reepresentara las cartas de Clima junto a su Habilidad, esta clase hereda desde AbstractCC
 * @param nombrecc
 * @param habilidad
 * El metodo aplicarHabilidad aplica la habilidad de las cartas clima 
 * El metodo ponerCarta permite poner las carta clima en el tablero en la seccion de las carta clima
 */
class CartaClima(nombrecc: String, habilidad: AbstractHabilidadCC) extends AbstractCC(nombrecc, habilidad) {

  override def aplicarHabilidad(): Unit = habilidad.aplicar()

  override def ponerCarta(tablero: TableroJugador): Unit = {
    tablero.ponerCartaClima(this)
  }

}