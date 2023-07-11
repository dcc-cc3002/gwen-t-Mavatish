package test.Cartas.StatePattern

import cl.uchile.dcc.gwent.patrones.StatePattern.{Controller, FinRonda, IniciarJuego, JSinLimites, Jugar, NuevasRondas, PrimerJugador, PrimeraRonda, Resultado, TConPasar, TSinPasar, Turnos}
import org.junit.Assert.assertThrows

class ControllerTest extends munit.FunSuite {
  val controller = new Controller()
  val state = new IniciarJuego()
  val state1 = new FinRonda()



  test("setState actualiza estado") {
    controller.setState(state)
    assert(controller.IsIniciarJuego())
  }

  test("una accion deberia llevar a su estado correspondiente como estado actual") {}
    controller.setState(state)
    controller.crearJTM()


  test("IsFinRonda tiene que ser verdadero si es el estado FinRonda") {
    controller.setState(state1)
    val result = controller.IsFinRonda()
    assert(result)
  }

  test("IsFinRonda deberia ser falso por no ser FinRonda el estado en el que se esta") {
    controller.setState(state)
    val result = controller.IsFinRonda()
    assert(!result)
  }
}
