package cl.uchile.dcc
package gwent.patrones.StatePattern

import gwent.patrones.StatePattern

/**
 * Clase FinRonda que representa el estado de finalización de una ronda en el juego.
 * Extiende la clase abstracta State.*
 * @return true, ya que este estado específico es el estado de "FinRonda".
 */
class FinRonda extends State {
  override def IsFinRonda(): Boolean = true
}
