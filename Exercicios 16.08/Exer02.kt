fun main () {
/*

        2- Faça um programa que entre com três números e coloque em ordem crescente.

 */
    println("Digite 3 números para colocar em ordem crescente: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()

    if(num2 > num1 && num3 > num1 && num2 > num3){
        println("A ordem crescente é: $num1, $num3, $num2")

    }else if(num3 > num1 && num2 > num1 && num3 > num2) {
        println("A ordem crescente é: $num1, $num2, $num3")
    }else if(num1 > num2 && num3 > num2 && num1 > num3) {
        println("A ordem crescente é: $num2, $num3, $num1")
    }else if(num2 > num3 && num1 > num3 && num2 > num1) {
        println("A ordem crescente é: $num3, $num1, $num2")
    }else if(num1 > num2 && num2 > num3 && num1 > num3) {
        println("A ordem crescente é: $num3, $num2, $num1")
    }else {
        (num3 > num1 && num1 > num2 && num3 > num2)
        println("A ordem crescente é: $num2, $num1, $num3")
    }
}