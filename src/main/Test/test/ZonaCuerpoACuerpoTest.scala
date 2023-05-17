package test
import cl.uchile.dcc.gwent.tablero.zonas.ZonaCuerpoACuerpo
class ZonaCuerpoACuerpoTest extends munit.FunSuite {
  var d1: ZonaCuerpoACuerpo = _
  var d2: ZonaCuerpoACuerpo = _

  override def beforeEach(context: BeforeEach): Unit = {
    d1 = new ZonaCuerpoACuerpo()
    d2 = new ZonaCuerpoACuerpo()
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

