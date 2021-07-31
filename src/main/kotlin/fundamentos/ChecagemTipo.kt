package fundamentos

fun main(args: Array<String>) {
    val valor = "abc"

    if (valor is String) {
        println(valor)
    } else if (valor !is String) {
        println("Nao é uma String")
    }
}