package exerciciosUri

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    val A = scan.nextLine().toDouble() * 2
    val B = scan.nextLine().toDouble() * 3
    val C = scan.nextLine().toDouble() * 5
    val media = (A + B + C) / 10
    val formatmedia = String.format("%.1f", media)

    println("MEDIA = $formatmedia")

}