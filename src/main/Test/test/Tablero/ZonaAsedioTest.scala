package test.Tablero

import cl.uchile.dcc.gwent.tablero.zonas.ZonaAsedio

class ZonaAsedioTest extends munit.FunSuite {
  var d1: ZonaAsedio = _
  var d2: ZonaAsedio = _

  override def beforeEach(context: BeforeEach): Unit = {
    d1 = new ZonaAsedio()
    d2 = new ZonaAsedio()
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

