package cl.uchile.dcc
package gwent.patrones
import cl.uchile.dcc.gwent.patrones.IniciarJuego

class Controller() {
  private var state: State = new IniciarJuego()

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
