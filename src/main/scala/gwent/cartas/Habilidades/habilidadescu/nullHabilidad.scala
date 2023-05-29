package cl.uchile.dcc
package gwent.cartas.Habilidades.habilidadescu

import gwent.cartas.Habilidades.AbstractHabilidadCU

/***
 * Objeto que representa a la habilidad null
 */
object nullHabilidad extends AbstractHabilidadCU(nombreHabilidad = "null") {
  override def aplicar(): Unit = {
    println("Efecto")
  }
}
