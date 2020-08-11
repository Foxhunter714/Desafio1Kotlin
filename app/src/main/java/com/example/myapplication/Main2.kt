package com.example.myapplication

fun main(){

    //primer ejemplo
    despedida()
    var saludoString = "hola soy un saludo"
    saludoString.saludo().print2()
    val saludo :String = saludoString.saludo()
    saludo.print2()

    //segundo ejemplo
    val entero = 6
    val result: Int = entero.add(4)
    print(result)
}
