package com.example.kotlinparaprincipiantes

import  java.util.*
import java.text.SimpleDateFormat

fun Date?.CustomFormat() : String {
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    return formatter.format(this)  //this hace referenca a la clase base, en este caso a DATE
}

val Date?.formatSize : Int
    get() = this.CustomFormat().length
