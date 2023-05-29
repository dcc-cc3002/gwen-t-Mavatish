package cl.uchile.dcc
package gwent.tablero.zonas

import gwent.cartas.cartaClima.CartaClima

import java.util.Objects
import scala.collection.mutable.ListBuffer

/***
 * Clase ZonaCartaClima determina la Zona del tablero donde se situan las cartas de la zona Clima
 * El metodo agregar permite poner cartas de tipo Carta Clima en el tablero
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales.
 */
class ZonaCartaClima {
  private var CartaC : CartaClima = _

  def agregar(carta: CartaClima): Unit ={
    CartaC = carta
  } 
  
  override def hashCode(): Int = {
    Objects.hash(
      classOf[ZonaCartaClima])
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[ZonaCartaClima]) {
      val other = obj.asInstanceOf[ZonaCartaClima]
      (this eq other)
    } else {
      false
    }
  }
}
