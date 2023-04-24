package test

import cl.uchile.dcc.gwent.cartas.cartaClima.{CartaClima}

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
    assertEquals(cc1.getnombre, "Zhongli")
    assertEquals(cc3.getnombre, "Hu-tao")
    assertEquals(cc2.darHabilidad(), "El señor de la noche")
    assertEquals(cc1.gethabilidad, "atraer")
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
  }
}