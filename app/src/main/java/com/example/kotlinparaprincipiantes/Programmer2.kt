package com.example.kotlinparaprincipiantes

class Programmer2(var name: String, var age : Int, val lenguaje : String) : Person (name, age){

    //Sobreescritura de métodos
    override fun work()
    {
        super.work()
        println("Este empleado està trabajando")
    }




}