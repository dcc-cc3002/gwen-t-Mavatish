package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller
import cl.uchile.dcc.gwent.patrones.StatePattern.Jugar
/**
 * Clase NuevasRondas que representa el estado donde se da inicio a nuevas rondas de juego
 * Extiende la clase abstracta State.
 * @return true, ya que este estado específico es el estado de "NuevasRondas".
 */
class NuevasRondas extends State {
  override def empezar2(controller: Controller): Unit = this.changeState(controller, new Jugar())
  override def IsNuevasRondas(): Boolean = true
}
