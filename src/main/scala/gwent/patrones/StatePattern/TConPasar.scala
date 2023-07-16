package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.JSinLimites

/**
 * Clase TConPasar que representa el estado donde ocurrio un turno con pasar
 * Extiende la clase abstracta State.
 * @return true, ya que este estado específico es el estado de "TConPasar".
 */
class TConPasar extends State {
  override def sinLimites(controller: Controller): Unit = this.changeState(controller, new JSinLimites())
  
  override def IsTConPasar(): Boolean = true

}
