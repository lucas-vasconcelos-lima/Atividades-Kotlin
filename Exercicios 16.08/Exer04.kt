import kotlin.math.pow
import kotlin.math.sqrt

fun main () {

    /*
    4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
    número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
    ímpar exiba o número elevado ao quadrado.

     */

        print("Digite um número: ")
        val num = readln().toFloat()


    val resto = num % 2


    if(resto > 0){

        val elev = num.pow(2)
        println("O numero $num é um valor ímpar e elevado ao quadrdado fica: $elev")

    }else {

        val raiz = sqrt(num)
        println("O numero $num é um valor par e sua raiz quadrdada é: ${"%.2f".format(raiz)}")

    }
}