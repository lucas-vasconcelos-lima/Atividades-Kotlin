/*
    6- Escrever um programa que receba vários números inteiros no teclado. E no
    final imprimir a média dos números múltiplos de 3. Para sair digitar
    0(zero).(DO...WHILE)
 */

fun main (){

    var soma = 0
    var cont = 0

    do{
        print("Digite um número: ")
        val num = readln().toInt()

        val resto = num % 3

        if(resto == 0){
            cont++
            soma += num

        };if(num == 0) {
            println("A média dos múltiplos de 3 é: ${soma / (cont -1)}")
        }
    }while (num != 0)

}