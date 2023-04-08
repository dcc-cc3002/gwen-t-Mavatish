package cl.uchile.dcc
package gwent

class CartaUnidad( private val nombrecu: String, private val clasificacion: String, private val valor: Int, private val habilidad: String ) {
  def getnombrecu() = nombrecu
  def getclasificacion() = clasificacion
  def getvalor() = valor
  def gethabilidad() = habilidad 
}
