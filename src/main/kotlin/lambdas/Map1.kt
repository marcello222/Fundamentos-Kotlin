package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Thiago", "Jonas")
    alunos.map { it.toUpperCase() }.apply { print(this) }
}