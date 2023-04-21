package cl.uchile.dcc
package Test

import cl.uchile.dcc.gwent.cartas.cartasUnidad.Asedio
class AsedioTest extends munit.FunSuite {
  var a1: Asedio = _
  var a2: Asedio = _

  override def beforeEach(context: BeforeEach): Unit = {
    a1 = new Asedio("Zhongli", "atraer", 5)
    a2 = new Asedio("Diluc", "El señor de la noche", 6)
  }

  test("Las cartas unidad de tipo asedio tienen nombre, habilidad y fuerza") {
    assertEquals(a1.darHabilidad(), "atraer")
    assertEquals(a2.darHabilidad(), "El señor de la noche")
    assertEquals(a1, a1)
  }
}
