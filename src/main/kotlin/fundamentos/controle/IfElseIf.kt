package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 7.3

    //Usando operador Range
    if (9 <= nota && nota <= 10) {
        println("Fantastico")
    } else if (7 <= nota && nota <= 8) {
        println("Parabens")
    } else if (4 <= nota && nota <= 6) {
        println("Tem como recuperar")
    } else if (0 <= nota && nota <= 3) {
        println("Te vejo no proximo semestre")
    } else {
        println("Nota invalida")
    }
    println(5 in 7..4)
}