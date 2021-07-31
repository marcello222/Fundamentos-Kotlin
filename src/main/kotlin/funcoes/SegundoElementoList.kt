package funcoes

fun <E> List<E>.secondoOrNull(): E? = if (this.size >= 2) this.get(1) else null


fun main(args: Array<String>) {
    val list = listOf("João", "Maria", "Pedro")
    print(list.secondoOrNull())
}