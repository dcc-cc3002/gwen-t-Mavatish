package cl.uchile.dcc
package gwent.cartas.cartaClima

import gwent.cartas.ComunCartas

import java.util.Objects

/**
 * Clase abstacta con interfaz en ComunCartas, que aplica dos atributos que tienen todas las carta clima
 * @param nombrecc
 * @param habilidad
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales. 
 */
abstract class AbstractCC(private val nombrecc: String, private var habilidad: String) extends ComunCartas {
  def getnombre = {
    nombrecc
  }

  def gethabilidad = {
    habilidad
  }

  override def hashCode(): Int ={
    Objects.hash(
      classOf[AbstractCC], nombrecc, habilidad)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[AbstractCC]) {
      val other = obj.asInstanceOf[AbstractCC]
      (this eq other) ||
        other.getnombre == nombrecc &&
          other.gethabilidad == habilidad 
    } else {
      false
    }
  }
}
