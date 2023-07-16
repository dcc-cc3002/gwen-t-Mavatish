package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.PrimeraRonda
/**
 * Clase PrimerJugador que representa el estado donde se crea el primer Jugador
 * Extiende la clase abstracta State.
 * @return true, ya que este estado específico es el estado de "PrimerJugador".
 */
class PrimerJugador extends State {
  override def sacarCartas(controller: Controller): Unit = this.changeState(controller, new PrimeraRonda())

  override def IsPrimerJugador(): Boolean = true
  

}
