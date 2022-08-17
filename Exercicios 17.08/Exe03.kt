fun main (){

    /*
        3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
        21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
        idade for =-99. (WHILE)
     */

    var contV = 0
    var contS = 0
    var idade = 0

    while (idade != -99){

        print("Digite sua idade: ")
        idade = readln().toInt()

        if(idade <= 21){
            contV++
        };if(idade > 50){
            contS++

        }

    }
    println("Total de pessoas com menos de 21 anos é: $contV")
    println("Total de pessoas com mais de 50 anos é: $contS")

}