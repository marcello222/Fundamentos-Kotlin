package fundamentos.controle

fun main(args: Array<String>) {
    var opcao: Int = 0

    while (opcao != -1) {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Voce escolheu a opcao $opcao ")
    }

    println("Até a proxima")
}