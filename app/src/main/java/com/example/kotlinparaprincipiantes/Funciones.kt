package com.example.kotlinparaprincipiantes

//Un funcion dentro de otra funcion se le denomina Funciones Locales

//Las funciones de Kotlin se pueden declarar en el nivel superior de un archivo,
// lo que significa que no necesita crear una clase para contener una función,
// lo que debe hacer en lenguajes como Java, C# y Scala

fun miFuncion(x : Int? = 0) : Int? = x?.times(3)

fun imprimir() = println( miFuncion(null))

//Las funciones pueden tener parámetros genéricos,
//que se especifican entre corchetes antes del nombre de la función

//     fun <T> singletonList(item: T): List<T> { /*...*/ }


var lamda = fun(expresion : String) : String {var nombre = "Savas" ;  return "$expresion $nombre"}

val lamdaUnit = fun() : Unit { var valor = 2 + 3 }

fun lamdaCall(){

    var newVal = lamda("Hola")
    println(newVal)

    miOtraLamda(lamda, lamdaUnit)

}

fun miOtraLamda(MyLamda : (String) -> String,
                FunVancia : () -> Unit){

    println(MyLamda("Hola2"))
    println(FunVancia)
}

//Especificando que el type de una funcion es Nullable
  //           ((Int, Int) -> Int)?


