package cl.uchile.dcc
package gwent

class Jugador (private val nombre: String, private var contador: Int) {
  def contar() = s"${contador}: vidas"
  def getnombre() = nombre
  def getcontador() = contador 

}
