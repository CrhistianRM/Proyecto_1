package parametros

 fun identificar(clave1: String, clave2: String) {
    if (clave1 == clave2) println("iguales")
    else print("distintas")
}
fun main() {
    print("Ingrese la primer clave:")
    val clave1 = readln()
    print("Ingrese la segunda clave:")
    val clave2 = readln()
    identificar(clave1, clave2)

    }
