package cl.uchile.dcc
package gwent.cartas.Habilidades.habilidadescc

import gwent.cartas.Habilidades.AbstractHabilidadCC

object NieblaImpenetrable extends AbstractHabilidadCC(nombreHabilidad = "Niebla Imprenetable"){
  override def aplicar(): Unit = {
    println("Efecto")
  }

}
