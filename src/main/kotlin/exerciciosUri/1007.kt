package exerciciosUri

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    val A = scan.nextLine().toInt()
    val B = scan.nextLine().toInt()
    val C = scan.nextLine().toInt()
    val D = scan.nextLine().toInt()
    val diferenca = (A * B) - (C * D)


    println("DIFERENÇA = $diferenca")

}