package cl.uchile.dcc
package Test
import gwent.CartaUnidad
class CartaUnidadTest extends munit.FunSuite {
  var cartaU1: CartaUnidad = _
  var cartaU2: CartaUnidad = _

  override def beforeEach(context: BeforeEach): Unit = {
    cartaU1 = new CartaUnidad("Botas", "gato", 5, "comer")
    cartaU2 = new CartaUnidad("Wiska", "gato", 1, "rasguñar")
  }

  test("Un jugador debe tener nombre") {
    assertEquals(cartaU1.getnombrecu(), "Botas")
    assertEquals(cartaU2.getnombrecu(), "Wiska")
    assertEquals(cartaU1.getclasificacion(), "gato")
    assertEquals(cartaU1, cartaU1)
  }
}
