fun main (){

/*
    5- Crie um programa que leia um número do teclado até que encontre um
    número igual a zero. No final, mostre a soma dos números
    digitados.(DO...WHILE)
 */

    var soma = 0

    do{
        print("Digite um número de 1 a 9: ")
        val num =  readln().toInt()
        soma += num

        if(num == 0) {
            println()
            println("a soma dos números digitados é: $soma")
        }
    }while (num != 0)









}