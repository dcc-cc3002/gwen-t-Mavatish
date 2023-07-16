package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Jugar
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
/**
 * Clase PrimeraRonda que representa el estado donde empieza la primera Ronda
 * Extiende la clase abstracta State.
 * @return true, ya que este estado específico es el estado de "PrimeraRonda".
 */
class PrimeraRonda extends State {
  override def empezar(controller: Controller): Unit = this.changeState(controller, new Jugar())

  override def IsPrimeraRonda(): Boolean = true
  }


