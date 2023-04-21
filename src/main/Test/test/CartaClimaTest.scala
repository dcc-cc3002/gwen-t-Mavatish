package cl.uchile.dcc
package Test

import cl.uchile.dcc.gwent.cartas.cartaClima.CartaClima

class CartaClimaTest extends munit.FunSuite {
  var cc1: CartaClima = _
  var cc2: CartaClima = _
  var cc3: CartaClima = _

  override def beforeEach(context: BeforeEach): Unit = {
    cc1 = new CartaClima("Zhongli", "atraer")
    cc2 = new CartaClima("Diluc", "El señor de la noche")
    cc3 = new CartaClima("Hu-tao", "Fantasma")
  }

  test("Un jugador debe tener nombre") {
    assertEquals(cc1.getnombrecc(), "Zhongli")
    assertEquals(cc3.getnombrecc(), "Hu-tao")
    assertEquals(cc2.darHabilidad(), "El señor de la noche")
    assertEquals(cc2, cc2)
  }
}