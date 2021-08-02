package oo

private val dentroDoArquivio = 1
//protected val protegidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
val publico = 1


private fun dentroDoArquivio() = 1
//protected fun protegidoNaoSuportadoAqui() = 1
internal fun dentroDoProjeto() = 1
fun publico() = 1

open class Capsula{
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}

class CapsulaFilha : Capsula(){
    fun verificarAcesso() {
       // println(Capsula().dentroDoObjeto)
       // println(Capsula().vaiPorHereanca)
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico)
    }
}

fun verificarAcesso(){
   // println(Capsula().dentroDoObjeto())
   // println(Capsula().vaiPorHeranca())
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())
}