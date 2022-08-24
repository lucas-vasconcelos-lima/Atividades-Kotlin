package exerAnimais_polimorfismo

class Cachorro : Animal (

    "Spoke",
    3
) {
    override fun emitirSom() {
        println("Auauau")
    }

    override fun movimento() {
        println("Correndo igual cachorro")
    }


}
