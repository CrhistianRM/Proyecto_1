package funciones_con_retorno

fun superficie(lado1: Int, lado2: Int): Int{
    val superficie = lado1 * lado2
return superficie
}


fun main(){
    print("Ingrese el primer lado del rectangulo -000001: ")
    val lado1 = readln().toInt()
    print("Ingrese el segundo lado del rectangulo 1: ")
    val lado2 = readln().toInt()
    print("Ingrese el primer lado del rectangulo 2: ")
    val lado3 = readln().toInt()
    print("Ingrese el segundo lado del rectangulo 2: ")
    val lado4 = readln().toInt()
 if (superficie(lado1,lado2) > superficie(lado3,lado4))
     println("La supericie del primer rectangulo es mas grande")
    else
        println("la superficie del segundo rectangulo es mas grande")

}