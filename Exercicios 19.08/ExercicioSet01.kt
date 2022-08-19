fun main (){

    /*
            Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
            trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
            programa deverá atender as seguintes funcionalidades:

            Armazenar dados da List
            Remover dados da list;
            Atualizar dados da list.
            Apresentar todos os dados da list.
    */


    while(true){


        println()
        println("Bem vindo ao sistema de controle de estoque, o que deseja executar? ")
        println()
        println("1 - Incluir produtos no estoque")
        println("2 - Remover itens do estoque")
        println("3 - Alterar produtos")
        println("4 - Ver lista de produtos")
        println()
        println("Digite a opção desejada: ")
        val opc = readln().toInt()

        // Dava para ter feito com o when ->
        if(opc == 1){
            adicionarProduto(String())
        }else if(opc == 2){
            removerItens(String())
        }else if(opc == 3) {
            alterarProdutos(String())
        }else if(opc == 4){
            listaProdutos(String())
        }else{
            println("Opção invalida")
            break
        }
    }
}

