package funcoes

fun imprimirMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}
fun imprimeMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun imprimeMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun imprimeMaior5(a: Int, b: Int)  {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimirMaior1(2, 1)
    imprimeMaior2(2, 1)
    imprimeMaior3(2, 1)
    imprimeMaior4(2, 1)
    imprimeMaior5(2, 1).run { 2 == 2 }.run{ print("Resultado = $this") }
}

