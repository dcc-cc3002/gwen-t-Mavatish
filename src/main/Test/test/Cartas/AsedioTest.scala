package test.Cartas

import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescu.nullHabilidad
import cl.uchile.dcc.gwent.cartas.cartasUnidad.Asedio
class AsedioTest extends munit.FunSuite {
  var a1: Asedio = _
  var a2: Asedio = _

  override def beforeEach(context: BeforeEach): Unit = {
    a1 = new Asedio("Zhongli", habilidad = nullHabilidad, 5)
    a2 = new Asedio("Diluc", habilidad = nullHabilidad, 6)
  }
test("AplicarHabilidad"){
  a1.aplicarHabilidad()
}
  test("Las cartas unidad de tipo asedio tienen nombre, habilidad y fuerza") {
    assertEquals(a2.fuerza, 6)
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
    assert(a2.equals(2)==false)
  }
}
