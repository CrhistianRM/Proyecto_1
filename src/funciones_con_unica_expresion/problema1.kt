package funciones_con_unica_expresion

fun retornarPromedio(valor1: Int, valor2: Int, valor3: Int) =  valor1 + valor2 + valor3 / 3

fun main(){
print("ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("ingrese el segundo valor: ")
    val valor2 = readln().toInt()
    print("ingrese el tercer valor: ")
    val valor3 = readln().toInt()
    print("el promedio es: ${retornarPromedio(valor1, valor2, valor3)}")
}