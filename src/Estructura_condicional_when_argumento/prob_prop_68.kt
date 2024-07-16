package Estructura_condicional_when_argumento

fun main(){
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    var cant4 = 0
    for(i in 1..10) {
        print("ingrese el numero de hijos: ")
        val valor = readln().toInt()
        when (valor) {
            0 -> cant1++
            1 -> cant2++
            2 -> cant3++
            else -> cant4++

        }
    }
    println("familias sin hijos: $cant1")
    println("familias con un hijo: $cant2")
    println("familias con dos hijos: $cant3")
    println("familias con mas de dos veliz hijos: $cant4")
}