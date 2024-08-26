package modificadores_private_public

class Operaciones{
    private var valor1: Int=0
    private var valor2: Int=0
    fun cargar(){
        print("Ingreseprimervalor:")
        valor1=readln().toInt()
        print("Ingresesegundovalor:")
        valor2=readln().toInt()
        sumar()
        restar()
    }
    private fun sumar(){
        val suma=valor1+valor2
        println("Lasumade$valor1 y $valor2 es$suma")
    }
    private fun restar(){
        val resta=valor1-valor2
        println("Larestade$valor1 y $valor2 es$resta")
    }
}
fun main(parametro:Array<String>){
    val operaciones1=Operaciones()
    operaciones1.cargar()
}