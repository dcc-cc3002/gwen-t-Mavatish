package cl.uchile.dcc
package gwent.patrones

class JSinLimites extends State {
  override def pasar2(controller: Controller): Unit = this.changeState(controller, new Turnos())

  override def jugarCarta2(controller: Controller): Unit = this.changeState(controller, new JSinLimites())

  override def IsJSinLimites(): Boolean = true

}
