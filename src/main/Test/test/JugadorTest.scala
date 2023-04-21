package cl.uchile.dcc
package Test

import cl.uchile.dcc.gwent.Jugador
import cl.uchile.dcc.gwent.cartas.mazo.Mazo
import cl.uchile.dcc.gwent.cartas.cartaClima.CartaClima
import cl.uchile.dcc.gwent.cartas.cartasUnidad.ADistancia
import cl.uchile.dcc.gwent.cartas.ComunCartas
import cl.uchile.dcc.gwent.cartas.mazo.Mazo

class JugadorTest extends munit.FunSuite {
  var j1: Jugador = _
  var j2: Jugador = _
  var m1: Mazo = _
  var m2: Mazo = _
  var gato1: ADistancia = _
  var gato2: CartaClima = _
  var gato3: CartaClima = _
  var gato4: ADistancia = _

  override def beforeEach(context: BeforeEach): Unit = {
    gato1 = new ADistancia("Wiska", "Molestar", 10)
    gato2 = new CartaClima("Botas", "rasguñar")
    gato3 = new CartaClima("Cleo", "dormir")
    gato4 = new ADistancia("Watson", "investigar", 9)
    var lista1: List[ComunCartas] = List(gato1, gato4)
    var lista2: List[ComunCartas] = List(gato2, gato3)
    m1 = new Mazo(lista1)
    m2 = new Mazo(lista2)
    j1 = new Jugador("Zhongli", 3, m1)
    j2 = new Jugador("Diluc", 4, m2)
  }

  test("Las cartas unidad de tipo A distancia tienen nombre, habilidad y fuerza") {
    assertEquals(j1.getnombre(), "Zhongli")
    assertEquals(j2.getcontador(), 4)
  }
}