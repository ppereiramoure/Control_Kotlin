class ejercicio3 {
    val listaF = { array: Array<Int> ->
        array.filter {
            it % 2 != 0
        }.forEach(){
            println(it)
        }
    }
}