package funciones_con_retorno

fun retornarPromedio(valor1: Int, valor2: Int, valor3: Int): Int {
    val su = (valor1 + valor2 + valor3) / 3
    return su
}

fun main (){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    print("Ingrese el tercer valor: ")
    val valor3 = readln().toInt()
    print("El promedio es: ${retornarPromedio(valor1, valor2, valor3)}")

}