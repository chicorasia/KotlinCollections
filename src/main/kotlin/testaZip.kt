fun testaZip() {
    val atoresESalarios: MutableMap<String, Double> = mutableMapOf(
        "H Ford" to 100000.0,
        "C Fisher" to 50000.0,
        "M Hamill" to 75000.0
    )

    val aumento = 1.5

    val salariosReajustados = atoresESalarios.values.map { it ->
        it * aumento
    }

    println(salariosReajustados)

    val atores = listOf("H Ford", "C Fisher", "M Hamill", "A Daniels")
    val caches = listOf(100000.0, 50000.0, 75000.0)

    val atoresComCache = atores.zip(caches)


    println(atoresComCache)
    val mapaAtoresECaches: MutableMap<String, Double> = mutableMapOf()

//    for (a in atoresComCache){
//        mapaAtoresECaches.putIfAbsent(a.first, a.second)
//    }
}