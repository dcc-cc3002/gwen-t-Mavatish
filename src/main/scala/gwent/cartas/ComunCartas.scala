package cl.uchile.dcc
package gwent.cartas

import gwent.tablero.Tablero

/***
 * Trait que permite dar haabilidad a todas las cartas (puesto que todas tienen una)
 */
trait ComunCartas {
  def darHabilidad (): String
  
  def ponerCarta (tablero: Tablero) : Unit

}
