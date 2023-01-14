// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, var duracao: Int = 15)

data class Formacao(val nome: String, var conteudos: String) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {

    val ConteudoEducacional = ConteudoEducacional("um", 15)

    val Formacao = Formacao("Kotlin", "BASICO")

    println(ConteudoEducacional.nome)
    println(ConteudoEducacional.duracao)
    println(Formacao.nome)
    println(Formacao.conteudos)
}
