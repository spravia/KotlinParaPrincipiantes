//    Funciones Infijas - en este ejemplo lo hice por una funcion por extensiòn   INT.   STRING. o
//    cualquier clase u objeto

package com.example.kotlinparaprincipiantes

data class MiDataClass(val nombre: String, val apellido : String)

infix fun Int.add( Val : Int) : Int
{
    return this + Val
}

infix fun MiDataClass.UnirValores(ValoresInput: MiDataClass) : MiDataClass {

    return ( MiDataClass( (this.nombre) + ValoresInput.nombre ,
                         this.apellido + ValoresInput.apellido))

}


fun probarInfix()
{

    val valor = 5 add 10 add 20 add 50

    println("LA suma es igual $valor")

    MiDataClass("Savas", "Pravia") UnirValores MiDataClass("Carlos", "Pravia")

    var dataClases = MiDataClass("Savas", "Pravia") UnirValores MiDataClass("Carlos", "Pravia")

    println(dataClases.nombre + dataClases.apellido)
}
