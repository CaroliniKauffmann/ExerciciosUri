package exerciciosUri

import java.util.*
import kotlin.math.PI
import kotlin.math.pow

fun main() {

    val scan = Scanner(System.`in`)
    val raio = scan.nextLine().toDouble()
    val area = PI * raio.pow(2)
    val formatarea = String.format("%.4f", area)

    println("A=$formatarea")
}