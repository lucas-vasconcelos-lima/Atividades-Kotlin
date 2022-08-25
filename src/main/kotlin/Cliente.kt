
class Cliente(
    var nome: String,
    var telefone: String,
    var endereco: String,
) {
    private val _listaDeCompras = mutableListOf<String>()
    val listaDecompras: List<String> = _listaDeCompras

    init{
        if(nome.isBlank()){
            throw Exception("Nome não pode ter valor nulo! ")
        }
    }

    fun adcList(adc: String) {
        println("Digite o nome do produto a ser adicionado: ")
        if (adc.isNotBlank()) {
            _listaDeCompras.add(adc)
            println("Produto cadastrado com sucesso!")
        } else {
            println("O $adc não pode ser cadastrado.")
        }
    }

    fun removerItem(remove: String) {
        println("Digite o nome do produto a ser removido: ")
        if (_listaDeCompras.contains(remove)) {
            _listaDeCompras.remove(remove)
            println("Produto removido com sucesso!")
        } else {
            println("Produto não encontrado.")
        }
    }

    fun listarProdutos() {
        println("Lista de compras: ")
        _listaDeCompras.forEach {
            it
            println(it)
        }
    }

}

