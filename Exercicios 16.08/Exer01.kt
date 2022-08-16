fun main() {
/*
        1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */
    println("Digite 3 valores: ")
    val valor1 = readln().toInt()
    val valor2 = readln().toInt()
    val valor3 = readln().toInt()


    if(valor2 > valor1){
        println("O maior valor é: $valor2")

    }else if(valor3 > valor1 ){
        println("O maior valor é: $valor3")

    }else{
        println("O maior valor é $valor1")

    }



}