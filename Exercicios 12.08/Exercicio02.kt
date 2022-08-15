fun main (){

    var poluicao: Float

    println("Indice de poluição: ")
    poluicao = readln().toFloat()

    if(poluicao < 0.25){

        println("Secretaria de meio ambiente informa: Niveis aceitaveis de poluição")

    };if(poluicao >= 0.25 && poluicao <0.4){
        println("Secretaria de meio ambiente informa: todas indústrias do Grupo 1 suspender atividades.")

    };if(poluicao >= 0.4 && poluicao <0.5) {
        println("Secretaria de meio ambiente informa: todas indústrias do Grupo 1 e 2 suspender atividades.")

    };if(poluicao >= 0.5){

        println("Secretaria de meio ambiente informa: todas indústrias suspender atividades!!")
    }
}