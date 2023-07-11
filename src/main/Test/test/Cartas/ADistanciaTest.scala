package test.Cartas

import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescc.ClimaDespejado
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescu.{RefuerzoMoral, VinculoEstrecho, nullHabilidad}
import cl.uchile.dcc.gwent.cartas.cartasUnidad.ADistancia
class ADistanciaTest extends munit.FunSuite {
  var d1: ADistancia = _
  var d2: ADistancia = _
var d3: ADistancia = _
  override def beforeEach(context: BeforeEach): Unit = {
    d1 = new ADistancia("Zhongli",habilidad = nullHabilidad, 5)
    d2 = new ADistancia("Diluc", habilidad = RefuerzoMoral,6)
    d3 =new ADistancia("Diluc", habilidad = VinculoEstrecho,6)
  }
  test("Habilidad"){
    d1.aplicarHabilidad()
    d2.aplicarHabilidad()
    d3.aplicarHabilidad()
  }

  test("Las cartas unidad de tipo A distancia tienen nombre, habilidad y fuerza") {
    assertEquals(d2.fuerza, 6)
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
    assert(d2.equals(2) == false)
}
  test("habilidades carta cl"){
    assert(RefuerzoMoral.equals(RefuerzoMoral)==true)
    assert(VinculoEstrecho.equals(nullHabilidad)== false)
  }
  test("Cambio de fuerza"){
    d1.CambioFuerza(5)
  }
}
