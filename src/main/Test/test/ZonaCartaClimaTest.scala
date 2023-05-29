package test

import cl.uchile.dcc.gwent.tablero.zonas.ZonaCartaClima

class ZonaCartaClimaTest extends munit.FunSuite {
  var d1: ZonaCartaClima = _
  var d2: ZonaCartaClima = _

  override def beforeEach(context: BeforeEach): Unit = {
    d1 = new ZonaCartaClima()
    d2 = new ZonaCartaClima()
  }

  test("hashcode") {
    d1.hashCode()
    d2.hashCode()
  }
  test("hashcode distintos") {
    println(d1.hashCode())
    println(d2.hashCode())
  }
  test("Equals") {
    assert(d1.equals(d1) == true)
    assert(d2.equals(d2) == true)
    assert(d1.equals(d2) == false)
    assert(d2.equals(2) == false)
  }
}

