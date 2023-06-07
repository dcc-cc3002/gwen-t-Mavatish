package cl.uchile.dcc
package gwent.patrones
import cl.uchile.dcc.gwent.patrones.State
import cl.uchile.dcc.gwent.patrones.PrimerJugador

class IniciarJuego extends State {
  override def crearJTM(controller: Controller): Unit = this.changeState(controller, new PrimerJugador())
  override def IsIniciarJuego(): Boolean = true
 
}
