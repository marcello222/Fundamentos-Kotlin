package fundamentos.controle

fun main(args: Array<String>) {

    val alunos = arrayListOf("Andre", "Carla", "Marcos")
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}