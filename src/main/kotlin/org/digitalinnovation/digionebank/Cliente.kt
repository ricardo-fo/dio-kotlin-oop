package org.digitalinnovation.digionebank

class Cliente(
    firstName: String,
    lastName: String?,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val password: String,
) : Pessoa(firstName, lastName, cpf), Logavel {
    override fun login(): Boolean = "abc123" == password

    override fun toString(): String = """
        Fullname: $firstName ${lastName ?: ""}
        CPF: $cpf
        Tipo: $clienteTipo
    """.trimIndent()
}