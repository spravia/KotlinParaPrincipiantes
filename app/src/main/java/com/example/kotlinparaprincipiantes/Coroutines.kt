package com.example.kotlinparaprincipiantes

import kotlinx.coroutines.*

fun mis_corutinas() = runBlocking{
        doWorld()
        println("1 Linea")

        principal()

}


//Con coroutineScope hasta que no se completen todos los llamados hijos no se completen
// runBlocking    -> bloquea ALL el proceso en si y espera a que ALL termine
// coroutineScope -> simplemente lo suspende, liberando el subproceso subyacente para otros usos. Esto quiere decir que ejecuta todos
//                   las invocaciones internas sin detenerse y espera respuestas

suspend fun doWorld()  = coroutineScope {
        launch {
                delay(2000L)
                println("2 Linea")
        }

        launch { delay(3000L)
                var a :String = "Pruebas"

                println("3 Linea $a")
        }

        val job = launch { delay(10000L)
                            println("Prueba JOB")
                   }

        //join hace que hasta que finalice job1 se ejecute la siguiente sentencia
        job.join()

        println("4 Linea")
}


private fun principal() = runBlocking {
        var numero: Int = 0

        repeat(100){
                launch {
                        delay(5000L)
                        var num = numero++
                        println("Envio $num")
                }
        }
}