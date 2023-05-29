package test
import cl.uchile.dcc.gwent.Jugador
import cl.uchile.dcc.gwent.cartas.ComunCartas
import cl.uchile.dcc.gwent.cartas.cartasUnidad.Asedio
import cl.uchile.dcc.gwent.cartas.cartasUnidad.ADistancia
import cl.uchile.dcc.gwent.cartas.cartasUnidad.CuerpoACuerpo
import cl.uchile.dcc.gwent.cartas.mazo.Mazo
import cl.uchile.dcc.gwent.tablero.Tablero
import cl.uchile.dcc.gwent.tablero.TableroJugador
import cl.uchile.dcc.gwent.cartas.cartaClima.CartaClima
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescu.nullHabilidad
import cl.uchile.dcc.gwent.cartas.Habilidades.habilidadescc.nullHabilidadcc

class TableroTest extends munit.FunSuite {
  var d1: Tablero = _
  var d2: Tablero = _
  var j1: Jugador = _
  var j2: Jugador = _
  var j3: Jugador = _
  var m1: Mazo = _
  var m2: Mazo = _
  var m3: Mazo = _
  var tj1: TableroJugador = _ 
  var tj2: TableroJugador = _
  var tj3: TableroJugador = _
  var gato1: ADistancia = _
  var gato2: Asedio = _
  var gato3: Asedio = _
  var gato4: ADistancia = _
  var gato5: CuerpoACuerpo = _
  var cc: CartaClima = _

  override def beforeEach(context: BeforeEach): Unit = {
    gato1 = new ADistancia("Wiska", habilidad = nullHabilidad, 10)
    gato2 = new Asedio("Botas", habilidad = nullHabilidad, 5)
    gato3 = new Asedio("Cleo", habilidad = nullHabilidad, 3)
    gato4 = new ADistancia("Watson", habilidad = nullHabilidad, 9)
    gato5 = new CuerpoACuerpo("Emma", habilidad = nullHabilidad, 0)
    var lista1: List[ComunCartas] = List(gato1, gato4)
    var lista2: List[ComunCartas] = List(gato2, gato3)
    var lista3: List[ComunCartas] = List(gato1, gato2)
    m1 = new Mazo(lista1)
    m2 = new Mazo(lista2)
    m3 = new Mazo(lista3)
    j1 = new Jugador("Zhongli", 3, m1)
    j2 = new Jugador("Diluc", 4, m2)
    j3 = new Jugador( "Pepe", 9, m3)
    tj1 = new TableroJugador(j1)
    tj2 = new TableroJugador(j2)
    tj3 = new TableroJugador(j3)
    d1 = new Tablero( tj1, tj2)
    d2 = new Tablero(tj2, tj3 )
    cc = new CartaClima("pepe", habilidad = nullHabilidadcc)

}
  test("poner Cartas distintas") {
    tj1.iniciar(d1)
    tj2.iniciar(d2)
    tj3.iniciar(d1)
    tj1.ponerCartaClima(cc)
    tj2.ponerCartaACuerpo(gato5)
    tj1.ponerCartaDistancia(gato1)
    tj3.ponerCartaAsedio(gato2)
    tj1.ponerCarta(gato1)
    tj2.ponerCarta(gato5)
    tj3.ponerCarta(gato2)
    tj3.ponerCarta(cc)
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
