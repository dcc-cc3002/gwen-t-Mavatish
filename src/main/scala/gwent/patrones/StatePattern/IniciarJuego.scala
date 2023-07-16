package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.PrimerJugador

/**
 * Clase IniciarJuego que representa el estado de Iniciacion del juego.
 * Extiende la clase abstracta State.
 * @return true, ya que este estado específico es el estado de "IniciarJuego".
 */
class IniciarJuego extends State {
  override def crearJTM(controller: Controller): Unit = this.changeState(controller, new PrimerJugador())
  override def IsIniciarJuego(): Boolean = true
 
}
