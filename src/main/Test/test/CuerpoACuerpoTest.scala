package cl.uchile.dcc
package Test

import cl.uchile.dcc.gwent.cartas.cartasUnidad.CuerpoACuerpo
class CuerpoACuerpoTest extends munit.FunSuite {
  var c1: CuerpoACuerpo = _
  var c2: CuerpoACuerpo = _

  override def beforeEach(context: BeforeEach): Unit = {
    c1 = new CuerpoACuerpo("Zhongli", "atraer", 5)
    c2 = new CuerpoACuerpo("Diluc", "El señor de la noche", 6)
  }

  test("Las cartas unidad de tipo A distancia tienen nombre, habilidad y fuerza") {
    assertEquals(c1.darHabilidad(), "atraer")
    assertEquals(c2.darHabilidad(), "El señor de la noche")
    assertEquals(c1, c1)
  }
}