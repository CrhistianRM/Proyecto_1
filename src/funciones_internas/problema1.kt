package funciones_internas

fun encontrarMayor(num1: Int, num2: Int): Int {
    // Función interna para determinar el mayor de dos números
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
    }
    return max(num1, num2)
}

fun main() {
    println("Mayor de (10, 5): ${encontrarMayor(10, 5)}")
    println("Mayor de (8, 20): ${encontrarMayor(8, 20)}")
    println("Mayor de (15, 15): ${encontrarMayor(15, 15)}")
    println("Mayor de (-3, -7): ${encontrarMayor(-3, -7)}")
    println("Mayor de (100, 50): ${encontrarMayor(100, 50)}")
}