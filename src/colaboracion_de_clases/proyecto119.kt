package colaboracion_de_clases

class Cliente(var nombre:String,var monto :Float){
    fun depositar(monto:Float){
        this. monto += monto
    }
    fun extraer(monto:Float){
        this.monto-=monto
    }
    fun imprimir(){
        println("$nombre tiene depositado la suma de $monto")
    }
}
class Banco{
    val cliente1:Cliente=Cliente("Juan",0f)
    var cliente2:Cliente=Cliente("Ana",0f)
    var cliente3:Cliente=Cliente("Luis",0f)
    var cliente4:Cliente=Cliente("Cristian",0f)
    fun operar(){
        cliente1.depositar(100f)
        cliente2.depositar(150f)
        cliente3.depositar(200f)
        cliente3.extraer(150f)
        cliente4.extraer(150f)
    }
    fun depositosTotales(){
        val total=cliente1.monto + cliente2.monto + cliente3.monto + cliente4.monto
        println("El totaldedinerodelbancoes:$total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
        cliente4.imprimir()
    }
}
fun main(parametro:Array<String>){
    val banco1=Banco()
    banco1.operar()
    banco1.depositosTotales()
}