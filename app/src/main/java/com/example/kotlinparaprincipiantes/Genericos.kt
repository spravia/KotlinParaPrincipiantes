package com.example.kotlinparaprincipiantes

import java.io.IOException


//Keyborads como in out reified lo estudie en el curso  de Kotlin Fundamental, capitulo 15 de Kevin Jones

fun Genericos(){

    var names : List<String> =  listOf("Kevin", "George", "Polly")

    val name = names.itemList(0)

    println(name)

    val n: Node<Int> = Node(2)

    try {
        println(n.value())
    }catch (e : IOException){

    }finally {

    }


}

   //Funcion de extensiòn sobre la clase List
fun <T> List<T>.itemList(ndx : Int) : T {
    return this[ndx]
}

class Node<T> (private val item : T){
    fun value() : T {
        return item
    }
}


   //Aqui estamos dicienco que T debe ser Numero
class Node2<T: Number> (private val item : T){
    fun value() : T {
        return item
    }
}