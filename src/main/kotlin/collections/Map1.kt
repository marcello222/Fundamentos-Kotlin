package collections

fun main(args: Array<String>) {
    var map = HashMap<Long, String>()

    map.put(101011212121, "João")
    map.put(101011223234, "Maria")
    map.put(212212122112, "Pedro")

    map.put(212212122112, "Pedro Filho")

    for (par in map){
        println(par)
    }

    for (nome in map.values) {
        println(nome)
    }

    for (cpf in map.keys) {
        println(cpf)
    }

    for ((cpf, nome) in map) {
        println(" $nome (CPF: $cpf)")
    }

    map.size.print()
    map.get(212212122112)?.print()
    map.contains(212212122112).print()
    map.remove(212212122112)?.print()
    map.clear()
    map.isEmpty().print()
}