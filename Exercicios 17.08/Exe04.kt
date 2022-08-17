/*
    4- Uma empresa desenvolveu uma pesquisa para saber as características
    psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
    era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
    (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
    agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
    pessoas, calcule e mostre: (WHILE)
     o número de pessoas calmas;
     o número de mulheres nervosas;
     o número de homens agressivos;
     o número de outros calmos;
     o número de pessoas nervosas com mais de 40 anos;
     o número de pessoas calmas com menos de 18 anos.

 */

fun main() {

    var cont = 0
    var pessoac = 0
    var womanN = 0
    var menA = 0
    var outroC = 0
    var PN4 = 0
    var PC18 = 0

    while (cont != 5) {

        print("Digite sua idade: ")
        val idade = readln().toInt()
        println()

        println("Escolha o sexo que se indentifica: ")
        println("1 - feminino")
        println("2 - mascunilo")
        println("3 - outros")
        val sexo = readln().toInt()
        println()

        println("Escolha a opção que melhor te define: ")
        println("1 - calma")
        println("2 - nervosa")
        println("3 - agressiva")
        val temp = readln().toInt()

        if(temp == 1){
            pessoac++
        };if(sexo == 1 && temp == 2){
            womanN++
        };if(sexo == 2 && temp == 3){
            menA++
        };if(sexo == 3 && temp == 1){
            outroC++
        };if(idade >= 40 && temp == 2){
            PN4++
        };if(idade <= 18 && temp == 1){
            PC18++
        }

        cont++

            if(cont == 5) {

            println("o número de pessoas calmas é: $pessoac")
            println("o número de mulheres nervosas é: $womanN")
            println("o número de homens agressivos é: $menA")
            println("o número de outros calmos é: $outroC")
            println("o número de pessoas nervosas com mais de 40 anos é: $PN4")
            println("o número de pessoas calmas com menos de 18 anos é: $PC18")
            }


    }

}