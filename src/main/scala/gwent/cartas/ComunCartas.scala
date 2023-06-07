package cl.uchile.dcc
package gwent.cartas

import gwent.tablero.{Tablero, TableroJugador}

/***
 * Trait que permite dar haabilidad a todas las cartas (puesto que todas tienen una)
 */
trait ComunCartas {
  def aplicarHabilidad (): Unit
  
  def ponerCarta (tablero: TableroJugador) : Unit

}
