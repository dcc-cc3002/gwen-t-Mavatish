package cl.uchile.dcc
package Test

import cl.uchile.dcc.gwent.cartas.cartasUnidad.ADistancia
class ADistanciaTest extends munit.FunSuite {
  var d1: ADistancia = _
  var d2: ADistancia = _

  override def beforeEach(context: BeforeEach): Unit = {
    d1 = new ADistancia("Zhongli", "atraer", 5)
    d2 = new ADistancia("Diluc", "El señor de la noche",6)
  }

  test("Las cartas unidad de tipo A distancia tienen nombre, habilidad y fuerza") {
    assertEquals(d1.darHabilidad(), "atraer")
    assertEquals(d2.darHabilidad(), "El señor de la noche")
    assertEquals(d1, d1)
  }
  

}
