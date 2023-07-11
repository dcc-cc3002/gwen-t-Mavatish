package cl.uchile.dcc
package gwent.cartas.Habilidades.habilidadescc

import gwent.cartas.Habilidades.AbstractHabilidadCC

object EscarchaMordiente extends AbstractHabilidadCC(nombreHabilidad= "Escarcha Mordiete"){
  override def aplicar(): Unit = {
    println("Efecto")
  }

}
