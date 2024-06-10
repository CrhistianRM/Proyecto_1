fun main () {
    /*
    var x = 1
    while (x <= 100){
        println(x)
        x++
     */
    /*
    print("Ingrese un valor")
    val valor: Int = readln().toInt()
    var x = 1
    while(x <= valor){
        println(x)
        x++
    }
*/
    /*
    var x = 1
    var suma = 0
    while (x <= 10) {
    print("Ingrese el valor $x")
        val valor = readln().toInt()
        suma = suma + valor
        x++
    }
    println("La suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("El promedio es $promedio")
    */
    /*
    print("Cuantas piezas se van a procesar:")
    val n = readln().toInt()
    var x = 1
    var cantidad = 0
    while (x <= n){
        print("Ingrese la medida de las piezas: ")
        val largo: Double = readln().toDouble()
        if (largo >= 1.20 && largo <= 1.30){
            cantidad = cantidad + 1

        }
        x++
        print("La cantidad de piezas aptas son $cantidad")
    }
*/


    //Escribir un programa que solicite ingresar 10 notas de alumnos y nos informecuántos tienen notas mayores o iguales a 7 y cuántos menores.

    /* var x = 1
 var suma = 0
 var mayor = 0
 var menor = 0
 while (x <= 10){
     print("Ingrese la nota $x:")
     val valor = readln().toInt()
     suma = suma + valor
     x++

     if (valor >= 70) mayor++
     else
         menor++
 }
 println("Tienen nota mayor a 7: $mayor")
 println("Tienen nota menor a 7: $menor")
*/

// Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa
//por teclado). Mostrar la altura promedio de las personas

    /*print("Ingrese la cantidad de alturas:")
var x = 1
var suma = 0.0
val n = readln().toInt()
while (x <= n) {
    print("Ingrese la altura:")
    val valor = readln().toDouble()
    suma = suma + valor
    x++
}
val promedio = suma / n
println("El promedio de las alturas es: $promedio")
 */
//En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y
//$500, realizar un programa que lea los sueldos que cobra cada empleado e
//informe cuántos empleados cobran entre $100 y $300 y cuántos cobran más
//de $300. Además el programa deberá informar el importe que gasta la
//empresa en sueldos al personal.

    /*print("Cantidad de empleados:")
val n = readln().toInt()
var x = 1
var valor1 = 0
var valor2 = 0
var gasto = 0.0
while (x <= n) {
    print("Ingrese el sueldo del empleado:")
    val sueldo = readln().toDouble()
    if (sueldo <= 300)
        valor1 = valor1 + 1
    else
        valor2 = valor2 + 1
    gasto = gasto + sueldo;
    x = x + 1
}
println("Sueldos entre 100 y 300: $valor1")
println("Cobran más de 300: $valor2")
println("Gastos en sueldos: $gasto")
 */

// Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44,
// etc. (No se ingresan valores por teclado)

    /*
var x = 1
var termino = 11
while (x <= 25) {
    println(termino)
    termino = termino + 11
    x++
}
*/
//Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16
//- 24, etc


    /*var x = 1
var multiplo = 8
while (x <= 62){
    println(multiplo )
multiplo = multiplo + 8
    x ++


 */
/*
    var x = 1
    var par = 0
    var impar = 0
    print("Ingrese la cantidad de numeros deseados:")
    val n = readln().toInt()
    while ( x <= n) {
        println("Ingrese un numero:")
        val valor = readln().toInt()
        x++
        if (valor % 2 == 0)
            par = par + x
        else
            impar = impar + x
    }
    println("La cantidad de numeros pares son: $par")
    println("La cantidad de numeros impar son: $impar")
    */
    
}