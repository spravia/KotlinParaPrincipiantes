package com.example.kotlinparaprincipiantes


//Se pueden hacer colecciones con
//listOf, setOf, mapOf
//arrayListOf, hashSetOf, hashMapOf

//Colecciones mutables
//mutableListOf

//Treemap

//Las colecciones pueden usar el metodo .filterNotNull() para validar si el objeto no es nulo


data class Meetings( val id: Int? = 0, val title: String? = "" )
fun colecciones(){
    val ints = listOf(1,2,3,4,5,6,7,8,100)

    val smallInts = ints.filter { it < 4 }

    for(i:Int in smallInts){
        println(i)
    }

    val squaredNum = ints.map { it * it }

    for(i:Int in squaredNum){
        println(i)
    }

    val squaredNumInt = ints
                        .filter { it < 4 }
                        .map { it * it }

    for(i:Int in squaredNumInt){
        println(i)
    }

    val meetings = listOf(Meetings(1,"Savas"), Meetings(2,"Alberto"))

               //asSequence permite procesar grandes volumenes de colecciones
    val tittle = meetings.asSequence()
                         .filter { it.title!!.startsWith("S")  }.map { m -> m.title!! }

    for(t in tittle)  println(t)

    val tittles : List<String> = meetings
                                 .filter { it.title!!
                                 .startsWith("S")  }.map { m -> m.title!! }

    for(t in tittles)  println(t)


    predicados()

    val coleccion = mutableListOf<String?>("Savas", "Pravia", "Vega", null)

    for(col : String in coleccion.filterNotNull()){
        println(col)
    }

}

 fun predicados(){

    val ints = listOf(1,2,3,4,5,6,7,8,100)
    val greaterThenThree = {v : Int -> v > 3}  //esta es una funcion landa
                                              // y la llamo desde aquì

    var largeInts = ints.all(greaterThenThree)  //buscar si hay alguno que cumpla con la conficiones

     println(largeInts)

     largeInts= ints.any(greaterThenThree)  //encuenta alguno que cumpla con la condicion

     println(largeInts)

     val num = ints.count(greaterThenThree)  //cuanta todos los que cumplen con la condición

     println(num)


     var found :Int? = ints.find(greaterThenThree)
     println(found)

     found = ints.find { it > 6 }  //find el primero que cumpla
     println(found)

}