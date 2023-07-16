package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.Turnos
/**
 * Clase JSinLimites que representa el estado donde se puede jugar sin limites la cantidad de cartas
 * Extiende la clase abstracta State.*
 * @return true, ya que este estado específico es el estado de "JsinLimites".
 */
class JSinLimites extends State {
  override def pasar2(controller: Controller): Unit = this.changeState(controller, new Turnos())

  override def jugarCarta2(controller: Controller): Unit = this.changeState(controller, new JSinLimites())

  override def IsJSinLimites(): Boolean = true

}
