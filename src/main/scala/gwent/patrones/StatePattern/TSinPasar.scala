package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.Jugar

class TSinPasar extends State {
  override def siguienteJugada(controller: Controller): Unit = this.changeState(controller, new Jugar())

  override def IsTSinPasar(): Boolean = true

}
