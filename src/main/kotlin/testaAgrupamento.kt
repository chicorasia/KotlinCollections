fun testaAgrupamento() {
    val listaPedidos: List<Pedido> = listOf(
        Pedido(1, 80.0),
        Pedido(2, 100.0),
        Pedido(3, 150.0),
        Pedido(4, 50.0)
    )

    val mapaPedidos = listaPedidos.associate { it ->
        Pair(it.numero, it)
    }
//    println(mapaPedidos)

    val pedidosComFreteGratis: Map<Boolean, List<Pedido>> = listaPedidos.groupBy { pedido: Pedido ->
        pedido.valor >= 100.0
    }

    println(pedidosComFreteGratis)

    val nomes = listOf(
        "Andre",
        "Aline",
        "Yana",
        "Francine",
        "Felipe",
        "Vitor",
        "Yuri",
        "Valentina",
        "Zilka",
        "Zuleide",
        "Zilfer"
    )

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['Z'])
}