package cl.uchile.dcc
package gwent.cartas.Habilidades.habilidadescc

import gwent.cartas.Habilidades.AbstractHabilidadCC

object LluviaTorrencial extends AbstractHabilidadCC(nombreHabilidad = "Lluvia Torrencial"){
  override def aplicar(): Unit = {
    println("Efecto")
  }
}
