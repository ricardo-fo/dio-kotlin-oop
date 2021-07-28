package org.digitalinnovation.digionebank

abstract class Funcionario(
    firstName: String,
    lastName: String?,
    cpf: String,
    val wage: Double,
) : Pessoa(firstName, lastName, cpf) {
    protected abstract fun calcularAuxilio(): Double
    override fun toString() : String = """
        Fullname: $firstName ${lastName ?: ""}
        CPF: $cpf
        Salário: $wage
        Auxílio: ${calcularAuxilio()}
    """.trimIndent()
}