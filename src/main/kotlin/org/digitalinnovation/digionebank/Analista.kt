package org.digitalinnovation.digionebank

class Analista(
    firstName: String,
    lastName: String?,
    cpf: String,
    wage: Double
) : Funcionario(firstName, lastName, cpf, wage) {
    override fun calcularAuxilio() = wage * 0.1
}