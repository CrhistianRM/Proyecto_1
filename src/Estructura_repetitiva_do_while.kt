fun main (){
    //problema 1
    /*
    do {
        print("Ingrese un valor comprendido entre 0 y 999: ")
        val valor = readln().toInt()
        if (valor < 10)
            print("el valor ingresado tiene 1 digito")
        else
            if (valor < 100)
                println("El valor ingresado tiene 2 digitos")
            else
                println("El valor ingresado tiene 3 digitos")
    } while (valor != 0)
*/
/*
    //problema 2
    var cant = 0
    var suma = 0
    do{
        print("Ingrese un valor (0 para finalizar): ")
        val valor = readln().toInt()
        if(valor != 0){
            suma += valor
            cant++
        }
    }while(valor != 0)
    if (cant != 0){
        val promedio = suma / cant
        print("El promedio de los valores ingresados es: $promedio")
    }else{
        print("No se ingresaron valores")

    }
 */
    /*
    //prblema 3

    var cantidad_inferior = 0 // por debajo de 9.8
    var cantidad_superior = 0 // por debajo de 10.2
    var cantidad_adecuada = 0 // entre 9.8 y 10.2

    do{
        print("Ingrese el peso de la pieza (0 para finalizar): ")
        val peso = readln().toDouble()
        if(peso > 10.2)
            cantidad_superior++
        else
            if(peso >= 9.8 && peso <= 10.2)
                cantidad_adecuada++
        else
            cantidad_inferior++
    }while(peso != 0.0)
    println("piezas aptas: $cantidad_adecuada")
    println("Piezas peso superior: $cantidad_adecuada")

     */
}