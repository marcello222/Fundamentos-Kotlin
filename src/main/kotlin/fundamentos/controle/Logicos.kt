package fundamentos.controle

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    //operador unario
    if (!comprouSorvete)
        println("A saude agradece.")
}