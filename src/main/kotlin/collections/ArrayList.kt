package collections

fun main(args: Array<String>) {
    val strings = arrayListOf("Carro", "Moto", "Barco", "Aviao")
    for (item in strings){
        println(item.toUpperCase())
    }
}