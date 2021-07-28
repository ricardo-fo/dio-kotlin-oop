package org.digitalinnovation.digionebank

class Gerente(
    firstName: String,
    lastName: String?,
    cpf: String,
    wage: Double,
    val password: String,
) : Funcionario(firstName, lastName, cpf, wage), Logavel {
    override fun calcularAuxilio() = wage * 0.3

    override fun login(): Boolean = "abc123" == password
}