package funciones_con_retorno

fun perimetro(lado: Int): Int {
    val perimetro = lado + lado + lado + lado
    return perimetro
}




fun main(){
    print("ingrese el valor del lado: ")
    val lado = readln().toInt()
    val perimetro = perimetro(lado)
    println("el valor del perimetro es: $perimetro")
}