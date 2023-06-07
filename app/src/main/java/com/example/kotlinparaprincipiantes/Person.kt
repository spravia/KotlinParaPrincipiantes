package com.example.kotlinparaprincipiantes


    //Cualquier clase tiene una super clase comun denominada "Any" en Kotlin
    //y hereda su comportamiento

    //open es un modificador indica que este clase se puede extender funcionalidad
open class Person (name : String, age : Int) :
        Work(),   //Hereda de una clase en este caso Work
        Game      //Hereda de N interfaces, en este caso solo de Game
    {

    open fun work(){
        println("Esta persona esta trabajando")
    }

        override fun goToWork() {
            println("Va a trabjar")
        }

        override val game: String = "Among Us"

        override fun play() {
            println("Esta persona esta jugando Play")
        }
    }