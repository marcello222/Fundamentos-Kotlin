package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata", "Bernardo", "William", "Andreia", "Caio")
    val ordenados = nomes.sortBy { it.reversed() }

    println(ordenados)
}