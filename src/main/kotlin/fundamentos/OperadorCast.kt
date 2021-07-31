package fundamentos

fun imprimirConceito(nota: Any) {
    when(nota as Int) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        else -> println("Nota invalida")
    }

}

fun main(args: Array<String>) {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5)
    for (nota in notas) {
        imprimirConceito(nota.toInt())
    }
}