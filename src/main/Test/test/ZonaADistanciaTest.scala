package test
import cl.uchile.dcc.gwent.tablero.zonas.ZonaADistancia

class ZonaADistanciaTest extends munit.FunSuite {
  var d1: ZonaADistancia = _
  var d2: ZonaADistancia = _

  override def beforeEach(context: BeforeEach): Unit = {
    d1 = new ZonaADistancia()
    d2 = new ZonaADistancia()
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
  }
}