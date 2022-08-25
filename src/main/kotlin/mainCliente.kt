package `Exercicios 23`.`08`

import Cliente

/*
        1. Cria uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão
        nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).

        A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.

        Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
        Ao instanciar a classe cliente na função main(),
        não esquecer de colocar dentro de um bloco try catch.

 */
fun main() {

    try {

        println("Digite seu nome: ")
        val nome = readln()
        println("Digite o endereço: ")
        val end = readln()
        println("Digite seu telefone: ")
        val tel = readln()

        val cliente1 = Cliente(nome, end, tel)

        while (true) {

            println()
            println("Menu")
            println("1 - Adc compras")
            println("2 - Remover compras")
            println("3 - Listar compras")
            println("4 - sair")

            print("Opc: ")
            val opc = readln().toInt()

            when (opc) {
                1 -> {
                    println("Digite o produto para adicionar: ")
                    val produto = readln()
                    cliente1.adcList(produto)
                }
                2 -> {
                    println("Digite o produto para remover: ")
                    val remove = readln()
                    cliente1.removerItem(remove)
                }
                3 -> {
                    cliente1.listarProdutos()
                }
                4 -> break
                else -> println("opção inválida")
            }


        }

    } catch (e: Exception) {
        println(e.message)
    }


}