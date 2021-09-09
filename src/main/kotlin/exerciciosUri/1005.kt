package exerciciosUri

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    val A = scan.nextLine().toDouble() * 3.5
    val B = scan.nextLine().toDouble() * 7.5
    val media = (A + B) / 11
    val formatmedia = String.format("%.5f", media)

    println("MEDIA = $formatmedia")

}