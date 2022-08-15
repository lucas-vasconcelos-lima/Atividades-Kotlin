fun main (){

    var qf: Int
    var mf: Int
    var ms: Int
    var somaf= 0
    var somas = 0
    var MS = 0
    var sal100 = 0f
    var p100: Float
    var salario = 0

    for(i in 0..2) {

        println("insira o numero de filhos: ")
        qf = readln().toInt()

        println("Insira valor do salário: ")
        salario = readln().toInt()

        if (salario <= 100.00) {
            sal100++

        };if (salario <= salario) {
            MS = salario

        }
            somaf += qf
            somas += salario

    }

            mf = somaf / 3
            ms = somas / 3
            p100 = sal100 / 3 * 100

                println("A média de salários é : $ms")
                println("A média de filhos por familia é: $mf")
                println("O percentual de familias com salárioa até R$100 é : $p100 %")
                println("O maior salário é: $MS")


}