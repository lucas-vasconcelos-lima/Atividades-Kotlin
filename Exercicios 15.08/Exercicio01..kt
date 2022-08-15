import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main (){

    /*
    1 - O usuário digitará sua idade e o programa deverá printar o ano em que ele nasceu.

    */

    val ano = LocalDate.now().year

    println("Digite sua idade: ")
    val idade = readln().toInt()

    println("Já fez aniversário? (s/n)")
    val niver = readln()

    if(niver == "s"){

        println("Seu ano de nascimento foi: ${ano - idade}")

    }else{

        println("Seu ano de nascimento foi: ${(ano - 1) - idade}")

    }







}

