package Arreglos

fun main(parametro: Array<String>) {

    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val sumaArreglo = IntArray(4)


    println("Ingrese los elementos para el primer arreglo:")
    for (i in arreglo1.indices) {
        print("Elemento ${i + 1}: ")
        arreglo1[i] = readln().toInt()
    }


    println("Ingrese los elementos para el segundo arreglo:")
    for (i in arreglo2.indices) {
        print("Elemento ${i + 1}: ")
        arreglo2[i] = readln().toInt()
    }


    for (i in sumaArreglo.indices) {
        sumaArreglo[i] = arreglo1[i] + arreglo2[i]
    }


    println("El resultado de la suma de ambos arreglos es:")
    for (i in sumaArreglo.indices) {
        println("Elemento ${i + 1}: ${sumaArreglo[i]}")
    }
}