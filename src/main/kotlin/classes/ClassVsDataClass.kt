package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 200)
    val g2 = Geladeira("Brastemp", 200)

    println(g1 == g2)

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    println(tv1 == tv2)
    println(tv1 === tv2)
    println(tv1.toString())
    println(tv1.copy(polegadas = 42))

    //Destructuring em data class
    val (marca, pol) = tv1
    println("$marca $pol'")
}