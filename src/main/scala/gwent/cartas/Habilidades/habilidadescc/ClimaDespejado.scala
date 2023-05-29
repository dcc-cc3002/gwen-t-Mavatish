package cl.uchile.dcc
package gwent.cartas.Habilidades.habilidadescc

import gwent.cartas.Habilidades.AbstractHabilidadCC

object ClimaDespejado extends AbstractHabilidadCC(nombreHabilidad= "Clima Despejado"){
  override def aplicar(): Unit = {
    println("Efecto")
  }
}
