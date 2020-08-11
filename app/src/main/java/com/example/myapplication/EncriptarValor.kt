package com.example.myapplication

fun String.encriptar (): String {

    //var textoEncriptado = this.replace ('a', '4')
    //textoEncriptado = textoEncriptado.replace('i','1')

    return this.replace('a','4')
        .replace('e','3')
        .replace('i', '1')
        .replace('o', '0')
        .replace('u','2')
}

fun String.print (){
    println(this)
}
fun main (){
    val texto2 = "aeiou"
    val texto: String
    texto  = "murcielago"
    texto.encriptar().print()
    texto.print()
    println("${texto.encriptar()}")
    println(texto2.encriptar())
}