package cl.uchile.dcc
package gwent.cartas.Habilidades.habilidadescu

import gwent.cartas.Habilidades.AbstractHabilidadCU

object RefuerzoMoral extends AbstractHabilidadCU(nombreHabilidad = "Refuerzo Moral"){
  override def aplicar(): Unit = {
    println("Efecto")
  }
}
