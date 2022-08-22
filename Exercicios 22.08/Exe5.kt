/*
   5) Crie uma classe patinete e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto patinete, defina as instancias deste
    objeto e apresente as informações deste objeto no console.

 */
fun main (){

    val patinete1 = Patinete()

    println("Escolha seu setup - ")
    println("Escolha a cor de seu patins: ")
    println("1 - verde")
    println("2 - amarela")
    println("3 - vermelha")
    var cor1 = readln()
    if(cor1 == "1"){
        cor1 = "verde"
    }else if(cor1 == "2"){
        cor1 = "amarela"
    }else if (cor1 == "3"){
        cor1 = "vermelha"
    }else{
        println("Opção inválida!")
    }
    patinete1.cor = cor1

    println("Escolha seu setup - ")
    println("Escolha a potência do motor: ")
    println("1 - 1000W" )
    println("2 - 1500W" )
    println("3 - 2000W")
    var motor1 = readln()
    if(motor1 == "1"){
        motor1 = "1000W"
    }else if(motor1 == "2"){
        motor1 = "1500W"
    }else if (motor1 == "3"){
        motor1 = "2000W"
    }else{
        println("Opção inválida!")
    }
    patinete1.motor = motor1

    println("Escolha seu setup - ")
    println("Escolha a cor do farol: ")
    println("1 - Branco")
    println("2 - Amarelo" )
    println("3 - Azul")
    var iluminacao1 = readln()
    if(iluminacao1 == "1"){
        iluminacao1 = "branca"
    }else if(iluminacao1 == "2"){
        iluminacao1 = "amarela"
    }else if (iluminacao1 == "3"){
        iluminacao1 = "azul"
    }else{
        println("Opção inválida!")
    }
    patinete1.ilumi = iluminacao1
    println()
    println("Seu patinete tem a cor $cor1, o motor de $motor1 e iluminação na cor $iluminacao1")
    println("Agora vamos dar uma volta! ")
    println("Pressione (+) para aumentar a velocidade e (-) para freiar")
    println("Produto destinado a velocidade máxima de 30Km/h")


   velocidade(String())


}



















