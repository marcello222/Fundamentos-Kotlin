package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    kotlin.io.println(funcaoSimples("OK"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    print(CARA)

    println("${soma(2, 3)} ${fundamentos.pacoteB.subtracao(4, 6)}")

}