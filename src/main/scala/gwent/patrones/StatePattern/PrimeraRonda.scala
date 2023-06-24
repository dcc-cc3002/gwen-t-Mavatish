package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.Jugar
import cl.uchile.dcc.gwent.patrones.StatePattern.Controller

class PrimeraRonda extends State {
  override def empezar(controller: Controller): Unit = this.changeState(controller, new Jugar())

  override def IsPrimeraRonda(): Boolean = true
  }


