package cl.uchile.dcc
package gwent.patrones

class NuevasRondas extends State {
  override def empezar2(controller: Controller): Unit = this.changeState(controller, new Jugar())
  override def IsNuevasRondas(): Boolean = true
}
