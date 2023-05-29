package cl.uchile.dcc
package gwent.cartas.cartasUnidad

import gwent.cartas.ComunCartas

import gwent.cartas.Habilidades.AbstractHabilidadCU
import java.util.Objects

/***
 * Clase abstacta con interfaz en ComunCartas, que aplica 3 atributos que tienen todas las carta clima
 * Hereda de ComunCartas
 * @param nombrecu
 * @param habilidad
 * @param fuerza
 * El metodo CambiodeFuerza permite actualizar la fuerza, siento la variable fuerzaActual la fuerza inicial 
 */
abstract class AbstractCU (val nombrecu: String, val habilidad: AbstractHabilidadCU, val fuerza: Int) extends ComunCartas {
  var fuerzaActual = fuerza

  def CambioFuerza(FuerzaNueva: Int): Unit = {
    fuerzaActual += FuerzaNueva
  }
}
