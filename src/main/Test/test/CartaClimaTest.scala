package test

import cl.uchile.dcc.gwent.cartas.cartaClima.CartaClima
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescc.{ClimaDespejado, EscarchaMordiente, LluviaTorrencial, NieblaImpenetrable, nullHabilidadcc}
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescu.RefuerzoMoral

class CartaClimaTest extends munit.FunSuite {
  var cc1: CartaClima = _
  var cc2: CartaClima = _
  var cc3: CartaClima = _
  var cc4: CartaClima = _
  var cc5: CartaClima = _

  override def beforeEach(context: BeforeEach): Unit = {
    cc1 = new CartaClima("Zhongli", habilidad = ClimaDespejado)
    cc2 = new CartaClima("Diluc", habilidad = EscarchaMordiente)
    cc3 = new CartaClima("Hu-tao", habilidad = nullHabilidadcc)
    cc4 = new CartaClima("Hu-tao", habilidad = LluviaTorrencial)
    cc5 = new CartaClima("Hu-tao", habilidad = NieblaImpenetrable)
  }
test("Habilidades"){
  cc1.aplicarHabilidad()
  cc2.aplicarHabilidad()
  cc3.aplicarHabilidad()
  cc4.aplicarHabilidad()
  cc5.aplicarHabilidad()
}
  test("Un jugador debe tener nombre") {
    assertEquals(cc1.nombrecc, "Zhongli")
    assertEquals(cc3.nombrecc, "Hu-tao")
    assertEquals(cc2, cc2)
  }
  test("hashcode") {
    cc1.hashCode()
    cc2.hashCode()
    cc3.hashCode()
  }
  test("hashcode distintos") {
    assert(cc1.hashCode() != cc2.hashCode())
    assert(cc2.hashCode() != cc3.hashCode())
    assert(cc3.hashCode() != cc1.hashCode())
  }
  test("Equals") {
    assert(cc1.equals(cc1) == true)
    assert(cc2.equals(cc2) == true)
    assert(cc3.equals(cc3) == true)
    assert(cc3.equals(cc1) == false)
    assert(cc2.equals(2) == false)
  }
  test("habilidades de clima"){
    assert(nullHabilidadcc.equals(nullHabilidadcc) == true)
    assert(nullHabilidadcc.equals(ClimaDespejado)== false)
  }
}