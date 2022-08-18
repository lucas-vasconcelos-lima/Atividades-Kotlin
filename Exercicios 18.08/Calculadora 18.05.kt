import kotlin.math.pow
import kotlin.math.sqrt

fun main () {

    print("Primeiro número: ")
    val num1 = readln().toDouble()
    print("Operador lógico: ")
    val op = readln()

    if (op == "+"){
        print("Segundo número: ")
        val num2 = readln().toDouble()
        println("O resultado é: ${soma(num1, num2)}")

    }else if (op == "-"){
        print("Segundo número: ")
        val num2 = readln().toDouble()
        println("O resultado é: ${subtracao(num1, num2)}")

    }else if (op == "*"){
        print("Segundo número: ")
        val num2 = readln().toDouble()
        println("O resultado é: ${multiplicacao(num1, num2)}")

    }else if (op == "/"){
        print("Segundo número: ")
        val num2 = readln().toDouble()
        println("O resultado é: ${divisao(num1, num2)}")

    }else if (op == "^"){
        print("Segundo número: ")
        val num2 = readln().toDouble()
        println("O resultado é: ${potencia(num1, num2)}")

    }else if(op == "raiz"){
        println("O resultado é: ${raiz(num1)}")

    }
}

fun soma (num1: Double, num2: Double): Double{

    return  num1 + num2
}
fun subtracao (num1: Double, num2: Double): Double{

    return  num1 - num2
}
fun multiplicacao (num1: Double, num2: Double): Double{

    return  num1 * num2
}
fun divisao (num1: Double, num2: Double): Double{

    return  num1 / num2
}
fun potencia (num1: Double, num2: Double): Double{

    return  num1.pow(2)
}
fun raiz (num1: Double): Double{

    return  sqrt(num1)
}

