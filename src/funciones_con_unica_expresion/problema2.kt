package funciones_con_unica_expresion

fun perimetro(lado: Int) = lado + lado + lado + lado
fun main(){
    print("ingrese el valor del lado: ")
    val lado = readln().toInt()
    val perimetro = perimetro(lado)
    println("el valor del perimetro es: $perimetro")
}