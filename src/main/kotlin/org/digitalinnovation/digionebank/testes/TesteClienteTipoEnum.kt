package org.digitalinnovation.digionebank.testes

import org.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { tipo ->
        println("${tipo.name} - ${tipo.descricao}")
    }

    val pf = ClienteTipo.PF
    println(pf)
}