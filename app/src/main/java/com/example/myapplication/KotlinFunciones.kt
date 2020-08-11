package com.example.myapplication

//ejemplo 1
fun String.saludo(): String{
    return "Hola retornado"
}

fun String.print2() {
    println(this)
}
fun despedida() {
    println("ciao")
}

//ejemplo 2
fun Int.add(valor: Int) : Int {
    return this + valor
}
