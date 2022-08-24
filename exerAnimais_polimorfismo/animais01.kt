package exerAnimais_polimorfismo

fun main (){

    println("Escolha um animal: ")




    val dog = Cachorro()
    println("O nome do cachorro é ${dog.nome}")
    println("tem ${dog.idade} anos de idade")
    println("Motoqueiro passa: ")
    dog.movimento()
    dog.emitirSom()

    println()

    val horse = Cavalo()
    println("O nome do cavalo é ${horse.nome}")
    println("tem ${horse.idade} anos de idade")
    horse.emitirSom()
    horse.movimento()

    println()
    
    val bicho = Preguiça()
    println("O nome da preguiça é ${bicho.nome}")
    println("tem ${bicho.idade} anos de idade")
    bicho.emitirSom()
    bicho.movimento()




}