package org.digitalinnovation.digionebank.testes

import org.digitalinnovation.digionebank.Analista

fun main() {
    val p1 = Analista("João", null, "111.111.111-11", 1000.0)
    ImprimirRelatorioFuncionario.imprime(p1)
}