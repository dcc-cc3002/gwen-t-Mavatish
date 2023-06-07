package cl.uchile.dcc
package gwent.patrones

class PrimeraRonda extends State {
  override def empezar(controller: Controller): Unit = this.changeState(controller, new Jugar())

  override def IsPrimeraRonda(): Boolean = true
  }


