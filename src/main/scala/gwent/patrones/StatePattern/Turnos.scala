package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.TConPasar
import cl.uchile.dcc.gwent.patrones.StatePattern.TSinPasar
import cl.uchile.dcc.gwent.patrones.StatePattern.Resultado
/**
 * Clase Turnos que representa el estado donde se ven los turnos de los jugadores
 * Extiende la clase abstracta State.
 * @return true, ya que este estado específico es el estado de "Turnos".
 */
class Turnos extends State {
  override def noPaso(controller: Controller): Unit = this.changeState(controller, new TSinPasar())

  override def paso(controller: Controller): Unit = this.changeState(controller, new TConPasar())
  override def contarPuntos(controller: Controller): Unit = this.changeState(controller, new Resultado())

  override def IsTurnos(): Boolean = true

}
