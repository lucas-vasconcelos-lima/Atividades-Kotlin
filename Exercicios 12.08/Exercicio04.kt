fun main (){

    var num1: Int
    var soma = 0
    var N = -1
    var seq = 0

    println("Insira um número de 1 a 9: ")
    num1 = readln().toInt()

    do {
        if (num1 <= 9 && num1 > 1) {

         N += 1
         seq = num1 - N
         soma = soma + seq
         }
    }
    while (N < num1)
    println("Resuldado da soma : $soma")
}