package exerciciosUri

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    scan.next().toInt()
    val quantidadePeca1 = scan.next().toInt()
    val valorPeca1 = scan.next().toDouble()
    scan.next().toInt()
    val quantidadePeca2 = scan.next().toInt()
    val valorPeca2 = scan.next().toDouble()
    val totalPecas1 = quantidadePeca1 * valorPeca1
    val totalPecas2 = quantidadePeca2 * valorPeca2
    val totalPagar = totalPecas1 + totalPecas2

    val formatValor = String.format("%.2f", totalPagar)

    println("VALOR A PAGAR: R$ $formatValor")


}