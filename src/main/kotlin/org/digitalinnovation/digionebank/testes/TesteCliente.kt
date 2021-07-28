package org.digitalinnovation.digionebank.testes

import org.digitalinnovation.digionebank.Cliente
import org.digitalinnovation.digionebank.ClienteTipo
import org.digitalinnovation.digionebank.testes.TesteAutenticacao

fun main() {
    val p1 = Cliente(
        firstName = "José",
        lastName = "Silva",
        cpf = "222.222.222-22",
        clienteTipo = ClienteTipo.PF,
        password = "abc123",
    )

    println(p1)
    TesteAutenticacao().autentica(p1)
}