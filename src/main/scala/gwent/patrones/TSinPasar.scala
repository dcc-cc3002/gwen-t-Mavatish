package cl.uchile.dcc
package gwent.patrones

class TSinPasar extends State {
  override def siguienteJugada(controller: Controller): Unit = this.changeState(controller, new Jugar())

  override def IsTSinPasar(): Boolean = true

}
