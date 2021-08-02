package collections

fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "Texto", true, 3.14)

    conjunto.add(3).print()
    conjunto.add(10).print()

    conjunto.size.print()

    conjunto.remove("a").print()
    conjunto.remove('a').print()

    conjunto.contains('a').print()
    conjunto.contains("Texto").print()
    conjunto.contains("texto").print()

    val nums = setOf(1, 2, 3) //somente leitura
    (conjunto + nums).print()
    (conjunto - nums).print()

    conjunto.intersect(nums).print() //nao muda o conjunto
    conjunto.retainAll(nums).print() // mmuda o conjunto

    conjunto.clear()
    conjunto.isEmpty().print()
}