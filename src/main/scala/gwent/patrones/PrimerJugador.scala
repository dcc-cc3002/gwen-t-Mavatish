package cl.uchile.dcc
package gwent.patrones
class PrimerJugador extends State {
  override def sacarCartas(controller: Controller): Unit = this.changeState(controller, new PrimeraRonda())

  override def IsPrimerJugador(): Boolean = true
  

}
