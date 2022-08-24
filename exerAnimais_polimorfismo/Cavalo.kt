package exerAnimais_polimorfismo

class Cavalo : Animal (

    "Alipio",
    6
){

    override fun emitirSom() {
        println("Relincho")
    }

    override fun movimento() {
        println("Correndo igual cavalo")
    }


}