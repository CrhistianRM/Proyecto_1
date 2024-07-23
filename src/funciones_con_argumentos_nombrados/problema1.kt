package funciones_con_argumentos_nombrados

fun tablaMultiplicar(numero: Int, termino: Int = 10) {
    println("Tabla de multiplicar del $numero hasta el término $termino:")
    for (i in 1..termino) {
        println("$numero x $i = ${numero * i}")
    }
}

fun main() {

    tablaMultiplicar(numero = 5, termino = 10)
    println()
}

