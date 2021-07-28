package org.digitalinnovation.digionebank.testes

import org.digitalinnovation.digionebank.Funcionario

class ImprimirRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}