val estoque = mutableListOf<String>()

// Função adicinar produto
fun adicionarProduto(inPro: String){

        println("Qual produto deseja incluir? ")
        val inPro = readln()
        estoque.add(inPro)
        println("Produto cadastrado com sucesso.")
}

// Função remover produtos
fun removerItens(proDel: String){
    println("Qual item deseja remover? ")
    val proDel = readln()

    if(estoque.contains(proDel)) {
        estoque.remove(proDel)
        println("Produto removido com sucesso.")
    }else {
        println("Produto não encontrado no estoque.")
    }
}
// Função alterar produtos
fun alterarProdutos(troca: String){
    println("Qual produto deseja alterar? ")
    val troca = readln()

    if (estoque.contains(troca)) {
        val posicao = estoque.indexOf(troca)
        println("Digite o novo produto: ")
        estoque[posicao] = readln()
        println("Produto alterado com sucesso.")
    }else{
        println("Produto não encontrado no estoque.")
    }
}
// Função listaDeProdutos
fun listaProdutos(lista: String){
    println("Lista de produtos no estoque: ")
    estoque.forEach {
        String
        println(it)
    }
}
