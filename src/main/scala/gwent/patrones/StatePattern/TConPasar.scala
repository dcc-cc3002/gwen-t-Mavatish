package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.JSinLimites

class TConPasar extends State {
  override def sinLimites(controller: Controller): Unit = this.changeState(controller, new JSinLimites())
  
  override def IsTConPasar(): Boolean = true

}
