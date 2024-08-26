package colaboracion_de_clases

class Dado(var valor: Int) {
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }

    fun imprimir() {
        println("Valor del dado: $valor")
    }
}

class JuegoDeDados {
    private val dado1 = Dado(1)
    private val dado2 = Dado(1)
    private val dado3 = Dado(1)

    fun jugar(): String {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()

        return if (dado1.valor == dado2.valor && dado2.valor == dado3.valor) {
            "Ganó"
        } else {
            "Perdió"
        }
    }
}

fun main() {
    val juego1 = JuegoDeDados()
    var resultado: String
    var intentos = 0

    do {
        intentos++
        resultado = juego1.jugar()
        println(resultado)
    } while (resultado != "Ganó")

    println("Número de intentos para ganar: $intentos")
}