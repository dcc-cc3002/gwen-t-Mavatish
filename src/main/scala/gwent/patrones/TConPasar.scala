package cl.uchile.dcc
package gwent.patrones

class TConPasar extends State {
  override def sinLimites(controller: Controller): Unit = this.changeState(controller, new JSinLimites())
  
  override def IsTConPasar(): Boolean = true

}
