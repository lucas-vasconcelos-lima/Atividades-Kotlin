fun main () {
/*

    Você se reveza para contar de 1 até .. infinito. Mas digamos 100.
    Sempre que o número for
    um múltiplo de 3, você deve dizer "Fizz" em vez do número
    um múltiplo de 5, você deve dizer "Buzz" em vez do número
    um múltiplo de 3 E 5, você deve dizer "Fizzbuzz" em vez do número
    Seu código deve imprimir os números de 1 a 100, mas com Fizz, Buzz e Fizzbuzz nos lugares certos.
 */
        val i = 0


    for (i in 1 .. 100) {
        println(i)
        val Fi = i % 3
        val Bu = i % 5
        val FiBu = i % 15

        ;if (Fi == 0) {

            println("Fizz")

        };if (Bu == 0) {
            println("Buzz")
        };if(Fi == 0 && Bu ==0){

        }
    }




}