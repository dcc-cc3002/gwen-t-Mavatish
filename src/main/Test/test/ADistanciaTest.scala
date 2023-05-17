package test

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
    assertEquals(d1.gethabilidad, "atraer")
    assertEquals(d2.getfuerza, 6)
    assertEquals(d1, d1)
  }
  test("hashcode"){
    d1.hashCode()
    d2.hashCode()
  }
  test("hashcode distintos") {
    assert(d1.hashCode() != d2.hashCode())
  }
  test("Equals"){
    assert(d1.equals(d1) == true)
    assert(d2.equals(d2) == true)
    assert(d1.equals(d2) == false)

}
}
