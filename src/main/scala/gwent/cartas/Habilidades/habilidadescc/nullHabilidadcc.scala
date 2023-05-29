package cl.uchile.dcc
package gwent.cartas.Habilidades.habilidadescc
import cl.uchile.dcc.gwent.cartas.Habilidades.AbstractHabilidadCC
object nullHabilidadcc extends AbstractHabilidadCC(nombreHabilidad = "null") {
    override def aplicar(): Unit = {
      println("Efecto")
    }
  }

