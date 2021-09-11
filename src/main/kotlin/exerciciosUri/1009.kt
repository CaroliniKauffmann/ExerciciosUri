package exerciciosUri

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    val nomeVendedor = scan.nextLine()
    val salarioFixo = scan.nextLine().toDouble()
    val totalVendas = scan.nextLine().toDouble()
    val comissao = totalVendas * 0.15
    val salarioComBonus = salarioFixo + comissao

    val formatValor = String.format("%.2f", salarioComBonus)

    println("NOME = $nomeVendedor")
    println("TOTAL = R$ $formatValor")

}