import kotlin.math.pow

fun main () {

    /*
        2 - Faça um programa em que o usuário digite o diâmetro de um círculo
        e calcule a área e o perímetro dele
     */

        println("Digite o diâmetro: ")
        val diam = readln().toDouble()

        val raio = diam / 2
        val area = raio.pow(2) * 3.14

        val peri = 2 * 3.14 * raio

        println("A área do círculo é: $area e o perimetro é: ${"%.2f".format(peri)}")

}
