package funciones_con_unica_expresion

fun retornarSuperficie(lado: Int) = lado * lado
fun main(parametro: Array<String>) {
    print("Ingrese el valor del lado del cuafrado:")
    val la = readln().toInt()
    println("La superficie del cuadrado es ${retornarSuperficie(la)}")
}
