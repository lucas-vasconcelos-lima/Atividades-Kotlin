package exerAnimais_polimorfismo

class Preguiça : Animal (
    "Flecha",
    25
){
    override fun emitirSom() {
        println("Som indecifrável")
    }

    override fun movimento() {
        println("Subindo, subindo ...")
    }

}