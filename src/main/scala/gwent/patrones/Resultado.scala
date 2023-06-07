package cl.uchile.dcc
package gwent.patrones

class Resultado extends State {
  override def perdio(controller: Controller): Unit = this.changeState(controller, new NuevasRondas())
  override def gano(controller: Controller): Unit = this.changeState(controller, new FinRonda())

  override def IsResultado(): Boolean = true

}
