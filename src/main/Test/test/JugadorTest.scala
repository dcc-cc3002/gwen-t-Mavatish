package test

import cl.uchile.dcc.gwent.Jugador
import cl.uchile.dcc.gwent.cartas.ComunCartas
import cl.uchile.dcc.gwent.cartas.cartaClima.CartaClima
import cl.uchile.dcc.gwent.cartas.cartasUnidad.ADistancia
import cl.uchile.dcc.gwent.cartas.mazo.Mazo
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescu.nullHabilidad
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescc.nullHabilidadcc

class JugadorTest extends munit.FunSuite {
  var j1: Jugador = _
  var j2: Jugador = _
  var j3: Jugador =_
  var m1: Mazo = _
  var m2: Mazo = _
  var gato1: ADistancia = _
  var gato2: CartaClima = _
  var gato3: CartaClima = _
  var gato4: ADistancia = _

  override def beforeEach(context: BeforeEach): Unit = {
    gato1 = new ADistancia("Wiska", habilidad = nullHabilidad, 10)
    gato2 = new CartaClima("Botas", habilidad = nullHabilidadcc)
    gato3 = new CartaClima("Cleo", habilidad = nullHabilidadcc)
    gato4 = new ADistancia("Watson", habilidad = nullHabilidad, 9)
    var lista1: List[ComunCartas] = List(gato1, gato4)
    var lista2: List[ComunCartas] = List(gato2, gato3)
    m1 = new Mazo(lista1)
    m2 = new Mazo(lista2)
    j1 = new Jugador("Zhongli", 3, m1)
    j2 = new Jugador("Diluc", 0, m2)
    j3 = new Jugador("Botas", -1, m2)
  }

  test("Las cartas unidad de tipo A distancia tienen nombre, habilidad y fuerza") {
    assertEquals(j1.getnombre(), "Zhongli")
  }
  test("hashcode") {
    j1.hashCode()
    j2.hashCode()
  }
  test("hashcode distintos") {
    assert(j1.hashCode() != j2.hashCode())
  }
  test("Equals") {
    assert(j1.equals(j1) == true)
    assert(j2.equals(j2) == true)
    assert(j2.equals(j1) == false)
    assert(j2.equals(2) == false)
  }
  test("Contador") {
    j1.getcontador()
    j2.getcontador()
    j3.getcontador()
  }
}