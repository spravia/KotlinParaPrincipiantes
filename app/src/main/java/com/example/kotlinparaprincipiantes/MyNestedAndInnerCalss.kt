package com.example.kotlinparaprincipiantes

class MyNestedAndInnerCalss {

    private val one : Int = 1

    class MyNestedClass(){

        fun sumar( valor1 : Int, valor2 : Int): Int {
            return  valor1 + valor2
        }
    }

    //inner permite a la clase interna acceder a las propiedades de la clase principal
    inner class MyInnerClass(){
        fun sumOne(number : Int) : Int{
            return number + one
        }
    }

}