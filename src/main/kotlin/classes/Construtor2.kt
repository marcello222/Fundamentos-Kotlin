package classes

class Filme2(val nome: String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = Filme2("monstros S.A", 1998, "Comédia")
    println(" A ${filme.genero} de ${filme.nome} foi lançado em ${filme.anoLancamento}")
}