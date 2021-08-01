package lambdas

data class Carros(val nome: String, val ano: Int)

fun main(args: Array<String>) {
    val carros = arrayListOf(
        Carros("Fiesta", 1999),
        Carros("Monza", 1998),
        Carros("Fusion", 2020)
    )

    val carroMaisNovo = carros.filter { it.ano >= 2000}.sortedBy { it.ano }

    println(carroMaisNovo)
}