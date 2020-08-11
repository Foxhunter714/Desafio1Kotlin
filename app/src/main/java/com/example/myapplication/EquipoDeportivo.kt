package com.example.myapplication

class EquipoDeportivo {

    val nombre: String
    val deporte: String

    constructor() {
        nombre = "sin nombre"
        deporte = "Futbol"
    }

    constructor(nombreEquipo: String) {
        nombre = nombreEquipo
        deporte = "Futbol"
    }

    constructor(nombreEquipo: String, deporteEquipo: String) {
        nombre = nombreEquipo
        deporte = deporteEquipo
    }

    override fun toString(): String {
        return "$nombre $deporte"
    }
}
    fun main (){
        val primerEquipoDeportivo = EquipoDeportivo()
        val segundoEquipoDeportivo= EquipoDeportivo("Cobreloa", "Cricket")
        val tercerEquipoDeportivo = EquipoDeportivo("Antofa")
        println(primerEquipoDeportivo)
        println(segundoEquipoDeportivo)
        println(tercerEquipoDeportivo)
    }

