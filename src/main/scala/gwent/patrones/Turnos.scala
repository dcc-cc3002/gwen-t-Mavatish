package cl.uchile.dcc
package gwent.patrones

class Turnos extends State {
  override def noPaso(controller: Controller): Unit = this.changeState(controller, new TSinPasar())

  override def paso(controller: Controller): Unit = this.changeState(controller, new TConPasar())
  override def contarPuntos(controller: Controller): Unit = this.changeState(controller, new Resultado())

  override def IsTurnos(): Boolean = true

}
