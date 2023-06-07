package com.example.kotlinparaprincipiantes

data class MyDataClass (var nombre : String? = "",
                        var edad: Int? = 0,
                        var salario : Int? = 0)

class Perro(alturaDeSalto: Int, function: () -> Unit) {

    fun quehaceelperro(alturaMetros : Int ,  accion : (Int) -> Unit){

        val salto : Int  = alturaMetros / 100

    }

}


fun accionDelPerro(){

    val perrito = Perro(120) { println("El perro salta") }

    println( perrito.toString() )

    val miNuevaDataClass = MyDataClass().apply {
        nombre = "Savas"
        edad = 45
        salario = 100
    }

    val miNuevaDataClass2 = MyDataClass()
    with(miNuevaDataClass2){
        nombre = "Savas"
        edad = 45
        salario = 100
    }

    val miNuevaDataClass3 = MyDataClass()
    miNuevaDataClass3.apply {
        nombre = "Savas"
        edad = 45
        salario = 100
    }

}