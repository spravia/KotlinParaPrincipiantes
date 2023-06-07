package com.example.kotlinparaprincipiantes

//Una interface no permite definir estados de una propiedad
//solo hacerlo por un metodo get

interface Game {

    val game: String

    fun play(){ }

    fun stream(){
        println("Estoy haciendo stream del video juego")
    }

}