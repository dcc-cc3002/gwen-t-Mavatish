package cl.uchile.dcc
package Test
import gwent.Jugador
class JugadorTest extends munit.FunSuite {
  var jugador1: Jugador = _
  var jugador2: Jugador = _

  override def beforeEach(context: BeforeEach): Unit = {
    jugador1 = new Jugador("Luffy", 5)
    jugador2 = new Jugador("Law", 7)
  }

  test("Un jugador debe tener nombre") {
    assertEquals(jugador1.getnombre(), "Luffy")
    assertEquals(jugador2.getnombre(), "Law")
    assertEquals(jugador2, jugador2)
  }
}