fun main (){

    /*
        3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
        categoria ela se encontra:

         10-14 infantil
         15-17 juvenil
         18-25 adulto
     */

            print("Digite sua idade: ")
            val idade = readln().toInt()

        when{

          idade in 1..14 -> println("Infantil")
          idade in 15..17 -> println("Juvenil")
          idade in 18..25 -> println("Adulto")

        }
}