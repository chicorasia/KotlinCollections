fun testaMap() {
    val elenco: MutableMap<String, String> = mutableMapOf(
        Pair("H Ford", "Kylo Ren"),
        "C Fisher" to "Leia",
        "M Hamill" to "Luke",
        "A Guiness" to "Obi-Wan"
    )


    //adicionando um elemento:
    elenco.put("A Daniels", "C-3PO")
    elenco["P Mayhew"] = "Chewbacca"
    elenco.putIfAbsent("P Mayhew", "Chewbacca") // não adiciona

    //removendo elemento
//    elenco.remove("H Ford")

    //quando passa os dois valores somente remove se tanto chave quanto valor corresponderem à entrada
    elenco.remove("H Ford", "Han Solo")

    //modificando um valor usando a chave
    elenco["H Ford"] = "Han Solo"

    //essas duas sintaxes são intercambiáveis:
    elenco.forEach { ator, personagem ->
        println("$ator como $personagem")
    }

    println("****")
    for (papel: Map.Entry<String, String> in elenco) {
        println("${papel.key} como ${papel.value}")
    }

    val papel: String? = elenco["A Guiness"]
    papel?.let {
        println("Papel: $it")
    }
}