package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.Jugar
/**
 * Clase TSinPasar que representa el estado donde se jugo un turno sin pasar
 * Extiende la clase abstracta State.
 * @return true, ya que este estado específico es el estado de "TSinPasar".
 */
class TSinPasar extends State {
  override def siguienteJugada(controller: Controller): Unit = this.changeState(controller, new Jugar())

  override def IsTSinPasar(): Boolean = true

}
