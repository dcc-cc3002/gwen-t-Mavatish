package cl.uchile.dcc
package gwent.patrones.StatePattern

import gwent.patrones.StatePattern.Controller

class State {
protected def changeState(controller: Controller, state: State): Unit = { controller.setState(state)}
  def error() = throw new AssertionError("Estado Equivocado")

  def crearJTM(controller: Controller): Unit = error()

  def sacarCartas(controller: Controller): Unit = error()

  def empezar(controller: Controller): Unit = error()
  
  def empezar2(controller: Controller): Unit = error()

  def siguienteJugada(controller: Controller): Unit = error()
  def paso(controller: Controller): Unit = error()

  def pasar(controller: Controller): Unit = error()
  def pasar2(controller: Controller): Unit = error()

  def jugarCarta(controller: Controller): Unit = error()
  def jugarCarta2(controller: Controller): Unit = error()

  def noPaso(controller: Controller): Unit = error()

  def contarPuntos(controller: Controller): Unit = error()

  def sinLimites(controller: Controller): Unit = error()

  def perdio(controller: Controller): Unit = error()

  def gano(controller: Controller): Unit = error()


  def IsIniciarJuego(): Boolean = false

  def IsPrimerJugador(): Boolean= false

  def IsPrimeraRonda(): Boolean = false

  def IsJugar(): Boolean = false

  def IsTurnos(): Boolean = false

  def IsNuevasRondas(): Boolean = false

  def IsTConPasar(): Boolean = false

  def IsTSinPasar(): Boolean = false

  def IsJSinLimites(): Boolean = false

  def IsResultado(): Boolean = false

  def IsFinRonda(): Boolean = false
}
