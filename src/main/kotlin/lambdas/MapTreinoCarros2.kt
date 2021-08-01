package lambdas


class MapTreinoCarros2(val nome: String, val preco: Double)

val valorDoCarro = listOf(
    MapTreinoCarros2("Ford", 23.000),
    MapTreinoCarros2("Fusion", 49.000),
    MapTreinoCarros2("Fiesta", 32.000)
    )

fun main(args: Array<String>) {
    val totalizar = {total: Double, atual: Double -> total + atual}
    val precoTotal = valorDoCarro.map { it.preco }.reduce(totalizar)

    println("O Preço médio é R$ ${precoTotal  /  valorDoCarro.size}")
}