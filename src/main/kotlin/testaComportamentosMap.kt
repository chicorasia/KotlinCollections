fun testaComportamentosMap() {
    val elencoEpFour: MutableMap<String, String> = mutableMapOf(
        Pair("H Ford", "Han Solo"),
        "C Fisher" to "Leia",
        "M Hamill" to "Luke",
        "A Guiness" to "Obi-Wan"
    )

    elencoEpFour += listOf("K Baker" to "R2-D2", "P Mayhew" to "Chewbacca")
    elencoEpFour -= "A Guiness"

    println(elencoEpFour.keys)
    println(elencoEpFour.values)

    val filteredMap = elencoEpFour.filter { (key, value) ->
        value.endsWith("n")
    }

    val filteredMapsByKeyOnly = elencoEpFour.filterKeys { it.startsWith("A") }

    println(elencoEpFour)


//    println(elencoEpFour.getOrDefault("S Connery", "Ator não encontrado!"))
//    println(elencoEpFour.getOrElse("S Connery") {
//        "Ator não encontrado"
//    })
}
