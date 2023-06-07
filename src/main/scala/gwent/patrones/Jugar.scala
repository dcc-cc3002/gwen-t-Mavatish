package cl.uchile.dcc
package gwent.patrones

class Jugar extends State {
  override def jugarCarta(controller: Controller): Unit = this.changeState(controller, new Turnos())

  override def pasar(controller: Controller): Unit = this.changeState(controller, new Turnos())

  override def IsTurnos(): Boolean = true
  
  

}
