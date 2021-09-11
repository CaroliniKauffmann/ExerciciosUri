package exerciciosUri

import java.util.*

fun main() {

    val scan = Scanner(System.`in`)
    val numeroFuncionario = scan.nextLine().toInt()
    val horasTrabalhadas = scan.nextLine().toInt()
    val valorHoras = scan.nextLine().toDouble()
    val salario = horasTrabalhadas * valorHoras
    val formatValor = String.format("%.2f", salario)

    println("NUMBER = $numeroFuncionario")
    println("SALARY = $ $formatValor")

}