package test

import cl.uchile.dcc.gwent.cartas.cartasUnidad.CuerpoACuerpo
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescu.nullHabilidad
class CuerpoACuerpoTest extends munit.FunSuite {
  var c1: CuerpoACuerpo = _
  var c2: CuerpoACuerpo = _

  override def beforeEach(context: BeforeEach): Unit = {
    c1 = new CuerpoACuerpo("Zhongli", habilidad = nullHabilidad, 5)
    c2 = new CuerpoACuerpo("Diluc", habilidad = nullHabilidad, 6)
  }
test("Aplicar Habilidad"){
  c1.aplicarHabilidad()
}
  test("Las cartas unidad de tipo A distancia tienen nombre, habilidad y fuerza") {
    assertEquals(c2.fuerza, 6)
    assertEquals(c1, c1)
  }
  test("hashcode") {
    c1.hashCode()
    c2.hashCode()
  }
  test("hashcode distintos") {
    assert(c1.hashCode() != c2.hashCode())
  }
  test("Equals") {
    assert(c1.equals(c1) == true)
    assert(c2.equals(c2) == true)
    assert(c1.equals(c2) == false)
    assert(c2.equals(2) == false)
  }
}