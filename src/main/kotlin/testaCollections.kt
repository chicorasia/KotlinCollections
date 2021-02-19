fun testaBancoDeNomes() {
    val bancoDeNomes = BancoDeNomes()

    bancoDeNomes.add("Chicória")
    bancoDeNomes.add("Netta")
    BancoDeNomes().add("Iujo") //como é um singleton não faz nova instância
    bancoDeNomes.add("Yuri")


    val listaNomes = bancoDeNomes.nomes //esta lista é uma cópia imutável
    bancoDeNomes.add("Jack")


    println(bancoDeNomes.nomes) //puxa os dados do Singleton
    println(listaNomes) //somente o snapshot da lista no instante da cópia
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun add(nome: String) {
        dados.add(nome)
    }

    companion object{
        private val dados = mutableListOf<String>()
    }




}


fun testaListas() {
    val nomes: Collection<String> = setOf(
        "Han",
        "Chewie",
        "Mando",
        "Obi Wan",
        "Moff Tarkin"
    )

    println(nomes)

    val listaOrdenada = nomes.sortedBy { it.length }.reversed()


    for (n in listaOrdenada) {
        println(n)
    }

    println("O nome Han está na lista: ${nomes.contains("Han")}")
    println("Tamnaho da coleção: ${nomes.size}")
}