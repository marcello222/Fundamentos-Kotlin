package funcoes

fun min(a: Int, b: Int): Int {
    return if (a < b) a else b
}

fun main(args: Array<String>) {
    println("O menor valor e:  ${ min(3, 4)}")
}