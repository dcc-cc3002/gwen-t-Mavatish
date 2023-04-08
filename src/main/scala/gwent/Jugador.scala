package cl.uchile.dcc
package gwent

/**
 * Esta clase represetara al jugador junto a las caracteristicas que este debe tener
 * @param nombre
 * @param contador 
 * esta variable se utilizara para contar las gemas, lo cual representa a las vidas del jugador  
 */
class Jugador (private val nombre: String, private var contador: Int) {
  def contar() = s"${contador}: vidas"
  def getnombre() = nombre
  def getcontador() = contador 

}
