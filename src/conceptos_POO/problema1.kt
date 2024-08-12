package conceptos_POO

class Alumno {
    var Nombre: String = ""
    var Nota: Int = 0

    fun Inicializar() {
        print("Ingrese el nombre del aulumno:")
        this.Nombre = readln()
        print("Ingrese la nota del alumno:")
        this.Nota = readln().toInt()
    }

    fun imprimiR(){
        println("Nombre: $Nombre y tiene una nota de $Nota")
    }

    fun regular(){
        if (Nota > 4)
            println("Nota mayor a 4")
        else
            if (Nota == 4)
                println("NOta igual a 4")
    }

}
fun main() {
    val Alumno1: Alumno
    Alumno1 = Alumno()
    Alumno1.Inicializar()
    Alumno1.imprimiR()
    Alumno1.regular()

    val Alumno2: Alumno
    Alumno2 = Alumno()
    Alumno2.Inicializar()
    Alumno2.imprimiR()
    Alumno2.regular()
}