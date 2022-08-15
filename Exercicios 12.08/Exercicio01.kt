fun main   () {

    var base: Int
    var altura: Int

    println("Inserir valor de base: ")
    base = readln()!!.toInt()

    println("Inserir valor de altura: ")
    altura = readln()!!.toInt()

    if(base > 0 && altura >0){

        println("O valor da area é: " + base * altura / 2)
    }else{

        println("Impossivel")
    }

}