package test

import cl.uchile.dcc.gwent.cartas.ComunCartas
import cl.uchile.dcc.gwent.cartas.cartaClima.CartaClima
import cl.uchile.dcc.gwent.cartas.cartasUnidad.ADistancia
import cl.uchile.dcc.gwent.cartas.mazo.Mazo
class MazoTest extends munit.FunSuite {
  var m1: Mazo = _
  var m2: Mazo = _
  var gato1: ADistancia = _
  var gato2: CartaClima = _
  var gato3: CartaClima = _
  var gato4: ADistancia = _

  override def beforeEach(context: BeforeEach): Unit = {
    gato1 = new ADistancia("Wiska", "Molestar", 10)
    gato2 = new CartaClima("Botas", "rasguñar")
    gato3 = new CartaClima("Cleo", "dormir")
    gato4 = new ADistancia("Watson", "investigar", 9)
    var lista1: List[ComunCartas] = List(gato1, gato4)
    var lista2: List[ComunCartas] = List(gato2, gato3)
    m1 = new Mazo(lista1)
    m2 = new Mazo(lista2)
  }

  test("Un mazo tiene una lista de cartas") {
    println("mazo sin añador carta")
    m1.mostrarCartas()
    println("mazo con una carta añadida")
    m1.addcarta(gato2)
    println("Mazo quitando una carta")
    m1.robarCarta(gato1)
    println("Mazo barajado")
    m1.barajar()
  }
  test("Comparando mazos") {
    assertEquals(m1.equals(m1),true)
    assertEquals(m2.equals(m2), true)
    assertEquals(m1.equals(m2), false)
  }
  test("hashcode"){
    m1.hashCode()
  }
}