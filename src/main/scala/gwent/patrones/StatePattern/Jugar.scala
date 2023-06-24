package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Turnos
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
class Jugar extends State {
  override def jugarCarta(controller: Controller): Unit = this.changeState(controller, new Turnos())

  override def pasar(controller: Controller): Unit = this.changeState(controller, new Turnos())

  override def IsTurnos(): Boolean = true
  
  

}
