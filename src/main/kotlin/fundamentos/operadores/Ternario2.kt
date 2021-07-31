package fundamentos.operadores

    fun obterResultado(nota : Double) : String {
     return if (nota >= 7) "PAssou" else "Reprovou"
    }
fun main(args: Array<String>) {
    println(obterResultado(nota = 6.3))
}