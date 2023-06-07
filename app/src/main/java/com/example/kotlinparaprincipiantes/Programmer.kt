package com.example.kotlinparaprincipiantes

import kotlinx.coroutines.channels.ValueOrClosed


//Declarar propiedades de la clase
class Programmer(val nombre : String, var edad : Int, val languages : Array<Language>,
                    // Asì indicamos que el valor puede ser null
                  val friends : Array<Programmer>? = null)
{


    enum class Language {
        KOTLIN,
        JAVA,
        FLUTTER,
        JS
    }

    fun validarString( valString : String): Boolean = (valString == "Savas")

    fun Code(){
        for (language : Language in languages){
            println(language)
        }

    }


}







