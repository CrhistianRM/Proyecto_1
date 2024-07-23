package funciones_parametros_valor_por_defecto

fun sumarEnteros(num1: Int, num2: Int, num3: Int = 0, num4: Int = 0, num5: Int = 0): Int {
    return num1 + num2 + num3 + num4 + num5
}

fun main() {
    println(sumarEnteros(1, 2))
    println(sumarEnteros(1, 2, 3))
    println(sumarEnteros(1, 2, 3, 4))
    println(sumarEnteros(1, 2, 3, 4, 5))
}