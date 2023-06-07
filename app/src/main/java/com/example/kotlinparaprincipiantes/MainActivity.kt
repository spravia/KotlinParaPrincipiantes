//   https://www.youtube.com/watch?v=ebQphhLpJG0&t=703s
//   https://www.youtube.com/watch?v=AA3N_yQQtHY&t=0s


// Lase clases, objetos, interfaces, constructores, funciones, propiedades y
//accesos set/get pueden tener modificadores de visibilidad

// private, protected,  internal y public


// SAM -> Single Abstract Method

package com.example.kotlinparaprincipiantes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.thread

typealias  MyMapList = MutableMap<Int, ArrayList<String>>
typealias  MyFun = (Int, String, MyMapList) -> Boolean
typealias  MyFun2 = (String) -> Unit
typealias  MyNestedClass = MyNestedAndInnerCalss.MyNestedClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a  : MyFun2 = { valor : String -> println(valor) }

        Genericos()

        a("Hola")

        //colecciones()

        //accionDelPerro()

        //probarInfix()

        //Llamando a un metodo statico
           //Empleado.mainFun("Hola")

        //mis_corutinas()

        //lamdaCall()

        //imprimir()

        //variablesYConstantes()

        //tiposDeDatos()

        //sentenciaIF()

        //sentenciaWhen()

        //arrayYAreglos()

        //mapsODiccionarios()

        //bucles()

        //nullSafety()

  /*      sayHello(thename = "Savas", age = 41)
        sumarNumeros(number1 = 2, secondNumber = 10)
        println(sumarNumeros(number1 = 15, sumarNumeros(10, 20)))
*/
        //misClases()

        //enumClase()

        //nestedandinnerclass()

        //herenciaDeClases()

        //misInterfaces()

        //misDataClases()

        //myTypes()

        //extensiones()

        //funcionesLamda()
    }

    enum class Direction(val dir: Int) {
        NORTE(1), SUR(-1), ESTE(1), OESTE(-1);

        fun description(): String {

            return when (this) {
                NORTE -> "La direccion es Norte"
                SUR -> "La direccion es Sur"
                ESTE -> "La direccion es Este"
                OESTE -> "La direccion es Oeste"
            }

        }
    }

    private fun enumClase() {
        var userDireccion: Direction? = null
        println(userDireccion);

        userDireccion = Direction.NORTE;

        println(userDireccion.name)  //name es la propiedad en string

        userDireccion = Direction.OESTE

        println(userDireccion.name)
        println(userDireccion.ordinal)

        //Funciones
        println(userDireccion.description())

        //Inicializacion
        println(userDireccion.dir)

    }

    private fun variablesYConstantes() {
        var myFirstVariable = "Hello Savas"
        var myFirstNumber = 10
        println(myFirstVariable)

        myFirstVariable = "Hello Matti"

        println(myFirstVariable)

        var mySecundNumber = myFirstNumber

        println(mySecundNumber)

        //Constantes
        val valorConstante = "Desarrollando una app movil"

        println(valorConstante)
    }

    private fun tiposDeDatos() {

        //Inferencia de tipos - Kotlin deduce automaticamente a que tipo de refiere/
        val micadena: String = "Hola, esta "
        val micadena2 = "es una prueba"
        val micadena3: String = micadena + micadena2

        println(micadena3)

        //Enteros Byte, Short, Int, Long
        val valInt: Int = 1
        println(valInt)
        val valShort: Short = 101
        println(valShort)
        val valByte: Byte = 100
        println(valByte)
        val valLong: Long = 5000
        println(valLong)

        //Decimales Float, Double
        val valDouble: Double = 1.545112
        println(valDouble)
        val valFloat: Float = 2.5f
        println(valFloat)

        //Boolean Bool
        val valBooleanTrue: Boolean = true
        val valBooleanFalse = false

    }

    private fun sentenciaIF() {

        val myNumber = 20

        println("$myNumber es 10")

        //>
        //<
        //>=
        //<=
        //==  igual
        //!=  diferente

        if (myNumber == 10) {
            println("El numero es 10")
        } else if (myNumber <= 10) {
            println("El nùmero es menor que 10")
        } else if (myNumber >= 10) {
            println("El nùmero es mayor que 10")
        } else if (myNumber > 1 && myNumber < 10) {
            println("El nùmero es mayor que 10")
        } else if ((myNumber == 2 || myNumber == 5) && (myNumber == 10)) {
            println("Se parece el numero")
        } else {
            println("No sabemos el numero")
        }

        //Operador lògico
        //&& and
        //|| or
        //!  not

    }

    fun sentenciaWhen() {
        val country: String = "España"
        val valor: Int = 5

        when (country) {
            "España" -> {
                println("Idioma es español")
            }
            "USA" -> {
                println("Ingles")
            }
            "Russia" -> {
                println("Ruso")
            }
            else -> {
                println("cualquier idioma")
            }
        }

        when (valor) {
            1 -> {
                println("El numero es 1")
            }
            5 -> {
                println("El numero es $valor")
            }
            6, 7, 8 -> {
                println("Muy joven")
            }
            in 9..20 -> {
                println("Prueba")
            }
            else -> {
                println("ultimo valor")
            }

        }
    }


    fun arrayYAreglos() {


        val name = "Savas"
        val apellido = "Pravia"
        val company = "BAC"
        val age = "32"

        val miarreglo: ArrayList<String> = arrayListOf<String>()

        miarreglo.add(name)
        miarreglo.add(apellido)
        miarreglo.add(company)
        miarreglo.add(age)

        println(miarreglo)

        miarreglo.addAll(listOf("Karen"))
        println(miarreglo)

        val myCompany: String = miarreglo[2]
        println(myCompany)

        miarreglo[2] = "Test"
        println(miarreglo)

        //Remover elementos del array
        miarreglo.removeAt(1)
        println(miarreglo)

        //primer elemento
        println(miarreglo.first())

        //ultimo elemento
        println(miarreglo.last())

        //FOREACH
        miarreglo.forEach {
            println(it)
        }

        //contar los elementos
        println(miarreglo.count())

        //Limpiar el arreglo
        miarreglo.clear()
        println("Elementos: " + miarreglo)

    }

    //**** Los mapas no son estructuras ordenadas
    fun mapsODiccionarios() {
        var myMap: Map<String, Int> = mapOf()

        //Agregar elementos a un mapa Mutable que permita cambiar los valores
        myMap = mutableMapOf("Brais" to 1, "Sara" to 2, "Pedro" to 3)

        println(myMap)


        //Crear un Mapa mutable
        myMap["Brais"] = 1
        myMap.put("Maria", 8)
        println(myMap)

        //Acceder elemento
        println(myMap["Sara"])

        //Eliminar elemento
        myMap.remove("Brais")
        println(myMap)


    }

    private fun bucles() {
        val myArray: List<String> = listOf("Savas", "Amaru", "Pravia", "Vega")

        for (myString: String in myArray) {
            println(myString)
        }

        for (x: Int in 0 until 30) {
            println(x)
        }

        //Hacer que vaya de 2 en dos
        for (x: Int in 0 until 30 step 2) {
            println(x)
        }

        //for(x:Int in 10 downTo  0 step 3){
        //    println(x)
        //}

        println("El final ...")

        val myNumeric: IntRange = (0..20)
        for (myNum: Int in myNumeric) {
            println(myNum)
        }

        //////***** WHILE

        //var x= 0
        //while (x<10)
        //    println(x)
        //    x++
    }

    private fun nullSafety() {
        var myString = "Mour"
        println(myString)

        var mySafetyString: String? = "MourDev"
        mySafetyString = null
        println(mySafetyString)

        /*
        if (mySafetyString != null){
            println(mySafetyString!!)
        }*/

        //Safe call
        //Si el valor es nulo, no se ejecuta el valor

        mySafetyString = "Sucribete"
        println(mySafetyString?.length)

        //let evalua si la variables no es nula y ejecuta
        mySafetyString?.let {
            println(it)  //it hace referencia al valor de la variable

            //Run se ejecuta cuando el valor de la variable sea nulo
        } ?: run {
            mySafetyString
        }
    }


    private fun sayHello(thename: String, age: Int) {
        println(thename)
        println(age)
    }

    private fun sumarNumeros(number1: Int, secondNumber: Int): Int {
        var suma = number1 + secondNumber
        println(suma)
        return suma
    }


    fun misClases() {
        var brais =
            Programmer("Savas", 41, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.JAVA))
        println(brais.nombre + brais.edad)

        brais.edad = 15

        brais.Code()

        val sara = Programmer(
            "Sara",
            41,
            arrayOf(Programmer.Language.KOTLIN, Programmer.Language.JAVA),
            arrayOf(brais)
        )

        println(
            brais.nombre?.let {
                brais.validarString(brais.nombre)
            }
        )

        val newClase : Any = "Mi casita"

            // AS como operador de conversion de tipos
            //en caso de que el cast genere error se indica as? para manejar el NULL
        val ClaseMia = newClase as? Programmer

        val ClaseMia2 = newClase as? String
        println(ClaseMia2)


        //Imprime el primer amigo de Sara
        println("${sara.friends?.first()?.nombre} es amigo de ${sara.nombre}")

    }


    private fun nestedandinnerclass() {
        val myNestedC = MyNestedAndInnerCalss.MyNestedClass() //Instanciar la clase
        val suma: Int = myNestedC.sumar(1, 2) //llamar a su metodo
        println(suma)


        val myinner = MyNestedAndInnerCalss().MyInnerClass()
        val sumarDos = myinner.sumOne(5)

        println(sumarDos)

    }

    fun herenciaDeClases() {
        val persona = Programmer2("Savas", 41, "Kotlin")
        persona.work()
        println(persona.goToWork())

        val disenador = Programmer2("Maria", 32, "Java")
        disenador.work()
        println(disenador.goToWork())

    }

    fun misInterfaces() {

        val persona = Person("Mario", 25)
        persona.play()
        persona.stream()

    }

    private fun misDataClases() {

        //metodos usables
        //  hashocode, toString, copy, equals
        val bras = Worker("Savas", 41, "Ingeniero")
        bras.lastWork = "Mi trabajo"
        val sara = Worker("Sara", 32, "Agricultor")

        println(bras.toString())

        if (bras == sara) {
            println("Son iguales")
        } else {
            println("No son iguales")
        }

        val bras2 = bras.copy(age = 52)
        println(bras2.toString())

        //Descomponer los valores dela DataClass
        val (nombre, edad) = bras

        println(nombre)
        println(edad)

        //Desestructuracion
        val (nom, eda, pro) = Desestructuracion()

        //Desestructuracion con mapOf
        val myMap = mapOf(1 to "Savas", 2 to 41, 3 to "Albañil")

        println("Desestructuracion por medio de componentN")
        for (elemento in myMap) {
            println(elemento.component1())
            println(elemento.component2())
        }

        println("Desestructuracion cuando queremos el campo con nombre")
        // o sino
        for ((id, name) in myMap) {
            println("$id")
            println("$name")
        }

        //Desestructuracion pero no queremos todos los campos
        println("Desestructuracion pero no queremos todos los campos")
        val (myId, _, myWork) = Worker()
        println("$myId")
        println("$myWork")

    }

    fun Desestructuracion(): Worker {

        return Worker("Savas", 41, "Cocinero")

    }

    fun myTypes() {


    }

    private fun extensiones() {

        val myDate = Date()
        println(myDate.CustomFormat())

        val myDateNullable: Date? = null
        //println(myDateNullable.CustomFormat())

    }


    private fun funcionesLamda() {

        //Una funcion lamda es una funcion que puede ser ejecutada por otra funcion

        val mySumFun = fun(x: Int, y: Int): Int = x + y
        val myMultFun = fun(x: Int, y: Int): Int = x * y

        println(operaciones(5, 6, mySumFun))

        myAsyncFun("Savas") {
            println(it)
        }
    }

    private fun operaciones(x: Int, y: Int, myfun: (Int, Int) -> Int): Int {
        val booleanVal = if (x > 3) "Es Mayor" else "Es Menor"
        println(booleanVal)

        return myfun(x, y)
    }

    private fun myAsyncFun(name: String, hello: (String) -> Unit) {
        val myNameString = "Helo man"
        hello(myNameString)

        thread {
            Thread.sleep(1000)
            hello(myNameString)
        }

    }
}

