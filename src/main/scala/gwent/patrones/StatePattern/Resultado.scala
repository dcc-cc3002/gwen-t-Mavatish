package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.NuevasRondas
import cl.uchile.dcc.gwent.patrones.StatePattern.FinRonda

class Resultado extends State {
  override def perdio(controller: Controller): Unit = this.changeState(controller, new NuevasRondas())
  override def gano(controller: Controller): Unit = this.changeState(controller, new FinRonda())

  override def IsResultado(): Boolean = true

}
