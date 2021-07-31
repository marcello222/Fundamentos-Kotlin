package funcoes

import fundamentos.souEsperto2

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario è subordinado(a) à $chefe"
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Maria"))
    println(relacaoDeTrabalho(funcionario = "João",  chefe = "Maria"))
}