package cl.uchile.dcc
package gwent.patrones.StatePattern

import cl.uchile.dcc.gwent.patronObserver.Observer
import cl.uchile.dcc.gwent.patrones.StatePattern.State
import cl.uchile.dcc.gwent.patrones.StatePattern.IniciarJuego

/**
 * Clase Controller que implementa el patrón Observer y el patron State.
 * Controla el estado del juego y y lo cambia a medida avanza el juego.
   * Método que se llama cuando se actualiza el estado del juego.
   * Update() trae el método "perdio" del estado actual y muestra un mensaje de "Game Over".
   * @param aState Nuevo estado del juego.
   * El método Error que lanza una excepción AssertionError con el mensaje "Estado Erroneo", indica un estado incorrecto en el juego.
   * El método crearJTM se utiliza para crear una JTM (Jugador, Tablero y Mano) en el juego.
   * El método sacarCartas se utiliza para sacar cartas en el juego.
   * El método empezar se utiliza para empezar el juego.
   * El método empezar2 se utiliza para empezar otra ronda.
   * El método siguienteJugada se utiliza para pasar a la siguiente jugada en el juego.
   * El método paso se utiliza para indicar que el jugador ha pasado su turno .
   * El método pasar se utiliza para pasar el turno en el juego.
   * El método pasar2 se utiliza para pasar del estado Jugar sin limites a Turnos.
   * El método jugarCarta se utiliza para jugar una carta en el juego.
   * El método jugarCarta2 se utiliza para jugar cartas sin limites en el estado Jugar sin Limites.
   * El método noPaso se utiliza cuando el jugador si jugo una carta.
   * El método contarPuntos se utiliza para contar los puntos en el juego.
   * El método sinLimites se utiliza para saber que se jugara una cantidad de cartas sin limites (las que desee jugaer el jugador).
   * El método perdio se utiliza para indicar que el jugador ha perdido en el juego.
   * El método gano se utiliza para indicar que el jugador ha ganado en el juego.
   */

class Controller() extends Observer{
  private var state: State = new IniciarJuego()

  override def update(): Unit = {
state.perdio(this)
    println("No hay mas gemas. Game Over")
  }
  def setState(aState: State): Unit = {
    state = aState
  }
def error() = throw new AssertionError("Estado Erroneo")
def crearJTM (): Unit = state.crearJTM(this)
def sacarCartas(): Unit= state.sacarCartas(this)
def empezar(): Unit = state.empezar(this)
  def empezar2(): Unit = state.empezar2(this)
def siguienteJugada(): Unit = state.siguienteJugada(this)

  def paso(): Unit = state.paso(this)
def pasar(): Unit = state.pasar(this)
  def pasar2(): Unit = state.pasar2(this)
def jugarCarta(): Unit = state.jugarCarta(this)
  def jugarCarta2(): Unit = state.jugarCarta2(this)
def noPaso(): Unit = state.noPaso(this)
def contarPuntos(): Unit = state.contarPuntos(this)
def sinLimites(): Unit = state.sinLimites(this)
def perdio(): Unit = state.perdio(this)
def gano(): Unit = state.gano(this)



  def IsIniciarJuego():Boolean = state.IsIniciarJuego()
  def IsPrimerJugador():Boolean = state.IsPrimerJugador()
  def IsPrimeraRonda():Boolean = state.IsPrimeraRonda()
  def IsJugar():Boolean = state.IsJugar()
  def IsTurnos():Boolean = state.IsTurnos()
  def IsNuevasRondas():Boolean = state.IsNuevasRondas()
  def IsTConPasar():Boolean = state.IsTConPasar()
  def IsTSinPasar():Boolean = state.IsTSinPasar()
  def IsJSinLimites():Boolean = state.IsJSinLimites()
  def IsResultado():Boolean = state.IsResultado()
  def IsFinRonda():Boolean = state.IsFinRonda()
}
