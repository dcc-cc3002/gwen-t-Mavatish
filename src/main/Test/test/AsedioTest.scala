package test

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
    assertEquals(a1.gethabilidad, "atraer")
    assertEquals(a2.getfuerza, 6)
    assertEquals(a1, a1)
  }
  test("hashcode"){
    a1.hashCode()
    a2.hashCode()
  }
  test("hashcode distintos") {
    assert(a1.hashCode() != a2.hashCode())
  }
  test("Equals") {
    assert(a1.equals(a1) == true)
    assert(a2.equals(a2) == true)
    assert(a2.equals(a1) == false)
  }
}
