package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Turnos
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller

/**
 * Clase Jugar que representa el estado donde empieza una ronda del juepo y se empieza a jugar.
 * Extiende la clase abstracta State.
 * @return true, ya que este estado específico es el estado de "Jugar".
 */
class Jugar extends State {
  override def jugarCarta(controller: Controller): Unit = this.changeState(controller, new Turnos())

  override def pasar(controller: Controller): Unit = this.changeState(controller, new Turnos())

  override def IsJugar(): Boolean = true
  
  

}
