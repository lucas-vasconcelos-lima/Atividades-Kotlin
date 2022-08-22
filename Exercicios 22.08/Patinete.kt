        // Atributos - Cor, potencia, iluminação, rodas
        // Métodos - acelerar, mudar cor da iluminação, freiar

class Patinete  {

    // Construtores secundários
    var ilumi = ""
    var som = ""
    var motor = ""
    var rodas = ""
    var cor = ""

}
fun velocidade(acelerador: String){
    var velocidade = 0
    println("A velocida atual é: $velocidade Km/h")

    val acelerador = readln()
    if(acelerador == "+"){
        velocidade += 10
    }else if(acelerador == "-" && velocidade >= 10){
        velocidade -= 10
    }else if(acelerador == "-" && velocidade == 0){
        println("Você já está parado!")
    }else{
        println("Comando inválido!")
    }
    println("A velocida atual é: $velocidade Km/h")

    }
