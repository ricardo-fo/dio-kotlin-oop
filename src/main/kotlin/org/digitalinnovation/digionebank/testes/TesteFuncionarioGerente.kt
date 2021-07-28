package org.digitalinnovation.digionebank.testes

import org.digitalinnovation.digionebank.Gerente

fun main() {
    val p1 = Gerente("Maria", null, "111.111.111-11", 1000.0, "abc123")
    ImprimirRelatorioFuncionario.imprime(p1)

    TesteAutenticacao().autentica(p1)
}