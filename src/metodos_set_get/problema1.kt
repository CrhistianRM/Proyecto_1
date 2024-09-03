package metodos_set_get

class Empleado(var nombre: String, var sueldo: Double) {

    fun imprimir() {
        println("Nombre: $nombre")
        println("Sueldo: $${"%.2f".format(sueldo)}")
    }
}

fun main() {
    val empleado = Empleado("Juan Pérez", 3000.0)
    empleado.imprimir()


    empleado.sueldo = 3500.0
    empleado.imprimir()
}