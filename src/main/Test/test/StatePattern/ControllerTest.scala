package test.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.{Controller, FinRonda, IniciarJuego, JSinLimites, Jugar, NuevasRondas, PrimerJugador, PrimeraRonda, Resultado, State, TConPasar, TSinPasar, Turnos}
import org.junit.Assert.assertThrows

class ControllerTest extends munit.FunSuite {
  val controller = new Controller()
  val state = new IniciarJuego()
  val state1 = new FinRonda()
  val state2 = new PrimerJugador()
  val state3 = new PrimeraRonda()
  val state4 = new Jugar()
  val state5 = new Turnos()
  val state6 = new TSinPasar()
  val state7 = new TConPasar()
  val state8 = new JSinLimites()
  val state9 = new Resultado()
  val state10 = new NuevasRondas()



  test("setState actualiza estado") {
    controller.setState(state)
    assert(controller.IsIniciarJuego())
  }

  test("una accion deberia llevar a su estado correspondiente como estado actual") {}
    controller.setState(state)
    controller.crearJTM()
    controller.setState(state2)
    controller.sacarCartas()
    controller.setState(state3)
    controller.empezar()
    controller.setState(state4)
    controller.pasar()
    controller.setState(state4)
    controller.jugarCarta()
    controller.setState(state5)
    controller.contarPuntos()
    controller.setState(state5)
    controller.noPaso()
    controller.setState(state5)
    controller.paso()
    controller.setState(state6)
    controller.siguienteJugada()
    controller.setState(state7)
    controller.sinLimites()
    controller.setState(state8)
    controller.jugarCarta2()
    controller.setState(state8)
    controller.pasar2()
    controller.setState(state9)
    controller.perdio()
    controller.setState(state9)
    controller.gano()
    controller.setState(state10)
    controller.empezar2()

  test("IsFinRonda tiene que ser verdadero si es el estado FinRonda") {
    controller.setState(state)
    assert(controller.IsIniciarJuego())
    controller.setState(state1)
    assert(controller.IsFinRonda())
    controller.setState(state2)
    assert(controller.IsPrimerJugador())
    controller.setState(state3)
    assert(controller.IsPrimeraRonda())
    controller.setState(state4)
    assert(controller.IsJugar())
    controller.setState(state5)
    assert(controller.IsTurnos())
    controller.setState(state6)
    assert(controller.IsTSinPasar())
    controller.setState(state7)
    assert(controller.IsTConPasar())
    controller.setState(state8)
    assert(controller.IsJSinLimites())
    controller.setState(state9)
    assert(controller.IsResultado())
    controller.setState(state10)
    assert(controller.IsNuevasRondas())
  }

  test("Si no es el estado, deberia arrojar falso, de clase State") {
    controller.setState(state)
    assert(!controller.IsFinRonda())
    controller.setState(state2)
    assert(!controller.IsIniciarJuego())
    controller.setState(state3)
    assert(!controller.IsPrimerJugador())
    controller.setState(state4)
    assert(!controller.IsPrimeraRonda())
    controller.setState(state5)
    assert(!controller.IsJugar())
    controller.setState(state6)
    assert(!controller.IsTurnos())
    controller.setState(state7)
    assert(!controller.IsTSinPasar())
    controller.setState(state8)
    assert(!controller.IsTConPasar())
    controller.setState(state9)
    assert(!controller.IsJSinLimites())
    controller.setState(state10)
    assert(!controller.IsResultado())
    controller.setState(state1)
    assert(!controller.IsNuevasRondas())
  }
  test("AssertionError de la clase State") {
    val state = new State()

    intercept[AssertionError] {
      state.crearJTM(controller)
    }
    intercept[AssertionError] {
      state.sacarCartas(controller)
    }
    intercept[AssertionError] {
      state.empezar(controller)
    }
    intercept[AssertionError] {
      state.empezar2(controller)
    }
    intercept[AssertionError] {
      state.siguienteJugada(controller)
    }
    intercept[AssertionError] {
      state.paso(controller)
    }
    intercept[AssertionError] {
      state.pasar(controller)
    }
    intercept[AssertionError] {
      state.pasar2(controller)
    }
    intercept[AssertionError] {
      state.jugarCarta(controller)
    }
    intercept[AssertionError] {
      state.jugarCarta2(controller)
    }
    intercept[AssertionError] {
      state.noPaso(controller)
    }
    intercept[AssertionError] {
      state.contarPuntos(controller)
    }
    intercept[AssertionError] {
      state.sinLimites(controller)
    }
    intercept[AssertionError] {
      state.perdio(controller)
    }
    intercept[AssertionError] {
      state.gano(controller)
    }
  }

}
