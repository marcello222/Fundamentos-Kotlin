package fundamentos

fun main(args: Array<String>) {

    //Tipos Numrericos inteiros
    val num1: Byte = 127
    val num2: Short = 32762
    val num3: Int = 2_147_483_647
    val num4: Long = 9_222_222_222_32232 // Long.MAX.VALUE


    //tipos numerico Reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //tipo caractere
    val char: Char = '?' //outros exemplos....'1', 'g', ' '

    //tipo booleano
    val boolean: Boolean = true // ou false


    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)

    println(1.0 is Double)

    //tudo é objeto


}