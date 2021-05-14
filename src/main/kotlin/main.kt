import kotlin.random.Random

fun main(args: Array<String>) {
    for (iterador in ArrayClass(11).array){
        println(iterador)
    }
    val array = ejercicio2(10){ Random.nextInt(50, 250)}

    array.array.forEach { println(it) }

    for (numero in ArrayClass(11).array){
        println(numero)
    }

    val array2 = ejercicio3().listaF(ejercicio2(10, {Random.nextInt(50, 250)}).array)
}




