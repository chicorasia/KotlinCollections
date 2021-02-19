private fun testaSets() {
    val umaNovaEsperanca: Set<String> = setOf("Luke", "Han", "Obi-Wan", "Chewie", "Leia", "Jabba")
    val imperioContraAtaca: List<String> = listOf("Luke", "Han", "Leia", "Yoda", "Chewie", "Lando")

//    val todosOsFilmes = imperioContraAtaca + umaNovaEsperanca
    val todosOsFilmes: MutableSet<String> = mutableSetOf()
    todosOsFilmes.addAll(umaNovaEsperanca)
    todosOsFilmes.addAll(imperioContraAtaca)
    todosOsFilmes.add("Greedo")
    todosOsFilmes.add("Greedo")

    println("Operação union: ${(umaNovaEsperanca union imperioContraAtaca) - "Han"}")
    println("Operação subtract: ${umaNovaEsperanca subtract imperioContraAtaca}")
    println("Operação intersect: ${umaNovaEsperanca intersect imperioContraAtaca}")
}