package org.digitalinnovation.digionebank.testes

import org.digitalinnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.name)
    println(digiOneBank.number)

    val nubank = digiOneBank.copy(number = 260, name = "Nubank")
    println(nubank.name)
    println(nubank.number)
}