package conceptos_funciones

fun CalcularCuadrado(){
    print("ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("ingrese el segund valor: ")
    val valor2 = readln().toInt()
    val cuadrado = valor1 * valor2
    println("el cuadrado de los valores es $cuadrado")
}
fun CargarSeparacion(){
    println("*****************************")
}
fun CalcularProducto(){
    print("ingrese el primer numero: ")
    val valor1 = readln().toInt()
    print("ingrese el segundo numero: ")
    val valor2 = readln().toInt()
    val producto = valor1 / valor2
    println("el producto de los numeros es $producto")
}
fun main(){
CalcularCuadrado()
    CargarSeparacion()
    CalcularProducto()

}