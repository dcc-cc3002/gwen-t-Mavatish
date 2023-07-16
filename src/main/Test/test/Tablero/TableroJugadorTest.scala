package test.Tablero

import cl.uchile.dcc.gwent.Jugador
import cl.uchile.dcc.gwent.cartas.ComunCartas
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescu.{RefuerzoMoral, VinculoEstrecho, nullHabilidad}
import cl.uchile.dcc.gwent.cartas.cartaClima.CartaClima
import cl.uchile.dcc.gwent.cartas.cartasUnidad.{ADistancia, Asedio, CuerpoACuerpo}
import cl.uchile.dcc.gwent.cartas.mazo.Mazo
import cl.uchile.dcc.gwent.tablero.TableroJugador
class TableroJugadorTest extends munit.FunSuite {
  var d1: TableroJugador = _
  var d2: TableroJugador = _
  var j1: Jugador = _
  var j2: Jugador = _
  var m1: Mazo = _
  var m2: Mazo = _
  var gato1: ADistancia = _
  var gato2: Asedio = _
  var gato3: Asedio = _
  var gato4: ADistancia = _

  override def beforeEach(context: BeforeEach): Unit = {
    gato1 = new ADistancia("Wiska", habilidad = nullHabilidad, 10)
    gato2 = new Asedio("Botas", habilidad = nullHabilidad, 5)
    gato3 = new Asedio("Cleo", habilidad = VinculoEstrecho, 3)
    gato4 = new ADistancia("Watson", habilidad = RefuerzoMoral, 9)
    var lista1: List[ComunCartas] = List(gato1, gato4)
    var lista2: List[ComunCartas] = List(gato2, gato3)
    m1 = new Mazo(lista1)
    m2 = new Mazo(lista2)
    j1 = new Jugador("Zhongli", m1)
    j2 = new Jugador("Diluc", m2)
    d1 = new TableroJugador(j1)
    d2 = new TableroJugador(j2)
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
