package exerAnimais_polimorfismo

abstract class Animal (
     val nome: String,
     var idade: Int

    ){

    abstract fun emitirSom ()

    open fun movimento () {}

}