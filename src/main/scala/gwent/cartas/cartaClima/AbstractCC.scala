package cl.uchile.dcc
package gwent.cartas.cartaClima

import gwent.cartas.ComunCartas

import cl.uchile.dcc.gwent.cartas.Habilidades.AbstractHabilidadCC

import java.util.Objects

/**
 * Clase abstacta con interfaz en ComunCartas, que aplica dos atributos que tienen todas las carta clima
 * @param nombrecc
 * @param habilidad
 * El método "hashCode" utiliza la clase "Objects" para generar un código hash único para cada instancia de la clase..
 * El método "equals" compara dos instancias de la clase para verificar si estas son iguales. 
 */
abstract class AbstractCC( val nombrecc: String, val habilidad: AbstractHabilidadCC) extends ComunCartas {

  override def hashCode(): Int ={
    Objects.hash(
      classOf[AbstractCC], nombrecc, habilidad)
  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[AbstractCC]) {
      val other = obj.asInstanceOf[AbstractCC]
      (this eq other) ||
        other.nombrecc == nombrecc &&
          other.habilidad == habilidad 
    } else {
      false
    }
  }
}
