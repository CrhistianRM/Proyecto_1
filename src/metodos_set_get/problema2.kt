package metodos_set_get


import kotlin.random.Random

class Dado(initialValue: Int) {

    var valor: Int = if (initialValue in 1..6) initialValue else 1
        set(value) {
            field = if (value in 1..6) value else 1
        }
    fun lanzar() {
        valor = Random.nextInt(1, 7)
    }

    fun imprimir() {
        println("Valor del dado: $valor")
    }
}

fun main() {
    val dado = Dado(7)
    dado.imprimir()

    dado.lanzar()
    dado.imprimir()
}