package com.example.myapplication
sealed class Genero{
    class JuegoDeRol: Genero()
    class JuegoDeMesas: Genero()
}
data class JuegosArcade(val nombre: String, val cantidadJugadores: Int, val tipoJuego: String, val genero: Genero)

    fun main(){
        //val juego = JuegosArcade(nombre= "Super Mario Bros", cantidadJugadores= 4, tipoJuego= "Nintendo 64", genero = Genero.JuegoDeMesas())
        val juego = JuegosArcade("Super Mario Bros", 4, "Nintendo 64", Genero.JuegoDeMesas())
        println("El juego se llama: ${juego.nombre}")
        println("El juego es de tipo: ${juego.genero}")
    }

