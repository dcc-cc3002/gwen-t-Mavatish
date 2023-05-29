package cl.uchile.dcc
package gwent.cartas.Habilidades.habilidadescu

import gwent.cartas.Habilidades.AbstractHabilidadCU

object VinculoEstrecho extends AbstractHabilidadCU(nombreHabilidad= "Vinculo Estrecho"){
  override def aplicar(): Unit = {
    println("Efecto")
  }
}
