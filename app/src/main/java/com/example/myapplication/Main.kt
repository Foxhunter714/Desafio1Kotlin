package com.example.myapplication
fun main() {
    //Imprimir mi nombre es
    val nombre = "Kevin"
    val apellido = "Flores"
    println("Mi nombre es: $nombre $apellido")

    //Declaración de 3 variables e impresión de la suma
    val a = 10
    val b = 20
    val c = 30
    var suma = a + b + c
    println("$a + $b + $c = $suma")

    //Declarar 1 variable String y otra Char
    val cadena = "Arataka Reigen"
    var vocal = 'A'
    vocal = 'B'
    println("Variable String: ${cadena.length}")
    println("Variable String: $vocal")

    //Declarar variable Float de forma explicíta
    val flotante = 10F
    println("Variable Float: $flotante")

    //Imprimir max. value of Byte and Short
    val byteMaximo = Byte.MAX_VALUE
    val shortMaximo = Short.MAX_VALUE
    println("Valores Int: $byteMaximo")
    println("Valores Int: $shortMaximo")

    //Imprimir min. value of Int y Long
    val intMinimo = Int.MIN_VALUE
    val longMinimo = Long.MIN_VALUE
    println("Valores Int: $intMinimo")
    println("Valores Int: $longMinimo")

    //Declarar variable Boolean con t or f
    val x = true
    val y: Boolean
    y = false
    println("Valores Boolean: $y")

    //Funcion imprimiendoParametros
   imprimiendoParametros("Hola", "mundo")

    //Funcion obteniendo IVA
    obtieneIVA(10000, 1.19)
}
fun imprimiendoParametros(frase1: String, frase2: String) {
        println("Suma de caracteres : ${frase1.count() + frase2.count()}")
    }

fun obtieneIVA(monto: Int, iva: Double = 1.19){
        println("Calculo de IVA: ${monto * iva} ")
    }


