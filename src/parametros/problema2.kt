package parametros

fun comparar(valor1: Int, valor2: Int, valor3: Int) {
    when {
        valor1 < valor2 && valor1 < valor3 -> {
            if (valor2 < valor3)
                println("$valor1 $valor2 $valor3 ")
            else println("$valor1 $valor3 $valor2 ")
        }
        valor2 < valor3 -> {
            if (valor1 < valor3)
                println("$valor2 $valor1 $valor3")
            else println("$valor2 $valor3 $valor1")
        }
        else -> {
            if (valor1 < valor2)
                println("$valor3 $valor1 $valor2")
            else println("$valor3 $valor2 $valor1")
        }
    }
}
fun main() {
    print("Ingrese el primer valor:")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readln().toInt()
    print("Ingrese el tercer valor:")
    val valor3 = readln().toInt()
    comparar(valor1, valor2, valor3)
    }