
fun main (){

    /*
             2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
     */


    var contp = 0
    var conti = 0
    for(i in 1..10 step 2){
        contp++
    };for(i in 2..10 step 2){
        conti++
    }
    println("A quantidade de números pares entre 1 e 10 é: $contp")
    println("A quantidade de números ímpares entre 1 e 10 é: $conti")

}